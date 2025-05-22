package org.acme;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.*;
import com.github.dockerjava.api.model.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.acme.sevice.ContainerInfo;
import org.acme.sevice.DockerService;
import org.acme.testclass.TarStreamUtil;
import org.acme.util.MyDateUtil;
import org.eclipse.microprofile.openapi.models.security.SecurityScheme;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Docker 관련 REST API 리소스 클래스.
 * Quarkus 기반 REST 엔드포인트로 도커 컨테이너 및 이미지 빌드, 실행, 정보 조회 기능 제공.
 */
@Path("/docker")
public class DockerClientResource {

    private static final Logger logger = LoggerFactory.getLogger(DockerClientResource.class);

    private static final String LOCAL_VOLUME_BASE = "/home/ung/ungDevOps/minio_docker/minio_data/docker/";

    private final DockerService dockerService;

    // Kafka 로그 발행을 위한 Emitter
    @Channel("docker-log")
    Emitter<String> emitter;

    private final Random random = new Random();

    // 컨테이너 정보 캐싱용 (필요 시 사용)
    private final Map<String, Container> containerMap = new HashMap<>();

    /**
     * 생성자 (의존성 주입)
     */
    public DockerClientResource(DockerService dockerService) {
        this.dockerService = dockerService;
    }

    /**
     * 컨테이너 리스트 조회
     * @param filter 필터 (RUNNING 등)
     * @return 필터 조건에 맞는 컨테이너 리스트
     */
    @GET
    @Path("/containerList")
    public Response containerInfo(@QueryParam("filter") DockerService.ContainerFilter filter) {
        switch (filter) {
            case RUNNING -> {
                return Response.ok(dockerService.runningContainers())
                        .status(Response.Status.OK)
                        .build();
            }
            default -> {
                return Response.ok(dockerService.getContainers())
                        .status(Response.Status.OK)
                        .build();
            }
        }
    }

    /**
     * 컨테이너에 터미널 명령 실행
     * @param commandText 실행할 명령어 문자열
     * @return 실행 로그
     */
    @POST
    @Path("/ter")
    public Response containerAttachTerminal(String commandText) {
        String[] command = {"bash", "-c", "echo 'export USERNAME=\"TTTTTT\"' >> ~/.bashrc"};

        String id = "1f19cd28371a1422737de362421e3974fe54ae4a1197981c1b609e8ec4f743e7";
        String[] exeCommand = commandText.split(" ");
        for (int i = 0; i < exeCommand.length; i++) {
            exeCommand[i] = exeCommand[i].trim();
        }

        List<String> cmdLog = dockerService.runCmd(id, command);

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        ByteArrayOutputStream stderr = new ByteArrayOutputStream();
        cmdLog.add(stderr.toString());
        cmdLog.add(stdout.toString());

        return Response.ok()
                .entity(cmdLog)
                .build();
    }

    /**
     * 스토리지에서 도커 이미지 빌드 (미구현)
     */
    @GET
    @Path("imageBuildFromStorage")
    public Response imageBuildFromStorage(@QueryParam("fileName") String fileName) {
        // dockerService.dockerfileBuild(fileName);
        return Response.ok()
                .entity(" ")
                .build();
    }

    /**
     * 도커 이미지 빌드 (파일 업로드)
     */
    @POST
    @Path("fileBuild")
    public Response dockerImageBuild(InputStream stream) throws Exception {
        // TODO: 파일 업로드 후 빌드 기능 추가
        Instant now = Instant.now();
        Set<String> tags = new HashSet<>();
        tags.add("my-jdk-v" + MyDateUtil.timeStampToString(now));

        InputStream tarInputStream = TarStreamUtil.Dockerfile(stream);
        try (DockerClient dockerClient = dockerService.getDockerClient()) {
            String imgId = dockerClient.buildImageCmd()
                    .withTags(tags)
                    .withTarInputStream(tarInputStream)
                    .exec(new BuildImageResultCallback())
                    .awaitImageId();
            try {
                PruneCmd pruneCmd = dockerClient.pruneCmd(PruneType.IMAGES);
                PruneResponse pruneResponse = pruneCmd.exec();
                if (Boolean.TRUE.equals(pruneResponse.getSpaceReclaimed() == null)) {
                    logger.info("Docker image build completed");
                }
            } catch (Exception e) {
                logger.error("댕글링 이미지 정리 중 오류 발생", e);
            }
            System.out.println(imgId);
            return Response.ok()
                    .entity(imgId)
                    .build();
        }
    }

    /**
     * 도커 컨테이너 생성 및 실행
     * @param imageTag 사용할 이미지 태그
     * @param port 컨테이너 포트
     * @param user 사용자 이름
     * @return 생성/실행 로그
     */
    @POST
    @Path("container/build")
    public Response createContainer(
            @QueryParam("imageTag") @DefaultValue("kwy2/dev-jdk") String imageTag,
            @QueryParam("port") int port,
            String user
    ) throws IOException {

        List<String> logs = new ArrayList<>();
        String localVolumeBind = LOCAL_VOLUME_BASE + user;

        final int MIN_PORT = 30000;
        final int MAX_PORT = 40000;
        int exPort = random.nextInt(MAX_PORT - MIN_PORT + 1) + MIN_PORT;

        emitter.send(Message.of(String.valueOf(exPort)));

        HostConfig hostConfig = new HostConfig()
                .withPortBindings(new PortBinding(Ports.Binding.bindPort(exPort), ExposedPort.tcp(port)))
                .withBinds(new Bind(localVolumeBind, new Volume("/work/" + user)));

        Instant now = Instant.now();

        try (DockerClient dockerClient = dockerService.getDockerClient()) {
            try (CreateContainerCmd create = dockerClient.createContainerCmd(imageTag)) {
                CreateContainerResponse containerResponse = create
                        .withName("my_jdk-" + MyDateUtil.timeStampToString(now))
                        .withHostConfig(hostConfig)
                        .withExposedPorts(ExposedPort.tcp(port))
                        .withAttachStderr(true)
                        .withAttachStdin(true)
                        .withAttachStdout(true)
                        .withTty(true)
                        .withStdInOnce(false)
                        .exec();

                String containerId = containerResponse.getId();

                try (StartContainerCmd startContainerCmd = dockerClient.startContainerCmd(containerId)) {
                    logger.info("Starting container: {}", containerId);
                    logs.add("Starting container: " + containerResponse.getId());
                    startContainerCmd.exec();
                }

                try (InspectContainerCmd inspectCmd = dockerClient.inspectContainerCmd(containerId)) {
                    InspectContainerResponse inspectContainerResponse = inspectCmd.exec();
                    logs.add("containerId : " + containerResponse.getId());
                    logs.add("log : " + inspectContainerResponse.getState());
                    logs.add("log : " + inspectContainerResponse);
                }

                String[] command = {"bash", "-c", "echo 'export USERNAME=\"" + user + "\"' >> ~/.bashrc"};
                dockerService.runCmd(containerId, command);
            }

            return Response.ok()
                    .entity(logs)
                    .build();

        } catch (Exception e) {
            logger.info(e.getMessage());
            logger.warn("Exception occurred during container build", e);
            return Response.ok()
                    .entity(e.getMessage())
                    .build();
        } finally {
            try {
                dockerService.cleanup();
            } catch (Exception e) {
                logger.warn("Cleanup failed", e);
            }
        }
    }
}