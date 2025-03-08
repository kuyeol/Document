# 코틀린 키워드 정리


## Overview

<procedure title="Kotlin">

<procedure title="todo.. ">
comming soon...
</procedure>
<procedure title="todo.. ">
comming soon...
</procedure>
...

</procedure>

<tabs>
  <tab id="code" title="코드">
    <p>
<code-block lang="kotlin"> 
 class Person(val name: String) {
        val children: MutableList&lt;Person&gt; = mutableListOf()
        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    } 
</code-block>
      </p>
</tab>
    <tab id="detail" title="설명">
<code-block lang="kotlin"> 
 class Person(val name: String) {
        val children: MutableList&lt;Person&gt; = mutableListOf()
        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    } 
</code-block>
    </tab>
</tabs>
</procedure>


<procedure>
  <h1> Class</h1>
 클래스 Any 를 상속받음
  Any에 포함된 메서드
  equals , hashcode ,toString

  
</procedure>

<procedure>
  <h1> Data Class</h1>
 Pojo 객체와 비슷한 인스턴스
  자바에 레코드와 사용이 유사하다
일반적으로 변수를 파라미터로 전달하여 생성
  <code-block lang="kotlin">
data class AnyPojo(val para:Type )
    
  </code-block>
</procedure>

<procedure> 
<tittle>object</tittle>
Todo()
</procedure>
