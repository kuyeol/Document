# 룸_데이터베이스 추상화

- 1. 룸데이터베이스 엑세스 객체 생성
    - 2. DAO 에서 객체 호출
        - 3. 레포지토리에서 DAO 호출 반환객체 매핑 


백엔드 서버에서 데이터베이스 작업 시
쿼리문은 jpa에 의해 생성된걸 사용 
추가 쿼리 사용시 엔터티 또는 레포지토리에 적용
리액티브 쿼리 사용 시 쿼리문을 별도 정의하여 데이터베이스 객체에 전달

> client.query("....").execuate()

```kotlin
@Dao
interface AnyDao<T>{

        //동적쿼리

val GETALL : String ="SELECT * from items ORDER BY name ASC"

    @Query(GETALL)
    fun getAllItems(): Flow<List<T>>

    @Query("SELECT * from items WHERE id = :id")
    fun getItem(id: Int): Flow<T>


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: T)

    @Update
    suspend fun update(item: T)

    @Delete
    suspend fun delete(item: T)


}

```

## DAO확장 설계 코드 개발

```kotlin

interface BaseDAO<T> {


  //쿼리문 상수 정의 
  //확장 클래스에서 재정의
 companion object{
      
    const val X_COL : String =""
    const val X_QUERY : String ="SELECT * FROM Post ORDER BY + $X_COL ASC"

    const val Y_COL : String =""
    const val Y_QUERY : String ="SELECT * from Post WHERE id = :$Y_COL"  

 }

  @Query(X_QUERY)
  fun getPostList(): Flow<List<T>>

  @Query(Y_QUERY)
  suspend fun getPostById(arg : String): T?

 //쿼리 수정 필요없는 함수는 재정의 하지 않아도 됨
 
  @Insert
  suspend fun insertPost( arg : T)

  @Delete
  suspend fun deletePost( arg : T)

  @Upsert
  suspend fun upsertPost( arg : T)



}


```




## 데이터베이스 클라이언트 객체 생성

