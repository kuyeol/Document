# 엔터티 정의

- 기본 구조

```java
@Entity
public class AnyEntity{

@Id
private Type id;

}
```

## @Entity
- 프로퍼티에 구성 된 데이터베이스에 인스턴스에 해당 하는 테이블 생성
<procedure>
<step> `spring.jpa.hibernate.ddl-auto` 
</step>


</procedure> 
  
    - = `create-drop` => 생성과 삭제 
    - = `create` => 생성
- 데이터베이스 테이블과 클래스의 인스턴스를 매핑
- 데이터베이스의 레코드를 클래스의 인스턴스로 표현

## @Id
- primaryKey로 사용할 필드에 주석처리 하여 해당 필드를 PK로 선언


