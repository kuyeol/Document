# 엔터티_매핑


```Java
@ManyToOne(fetch = FetchType.LAZY)
@NotNull
private TopicEntity topic;
```

```Java
@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "topic")
@BatchSize(size = 20)
private List<NewsEntity> news =new ArrayList<>();
```