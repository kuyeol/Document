# 코틀린 키워드 정리


## Companion

<procedure>
<note>
<p>companion<p>
클래스와 연결: 컴패니언 오브젝트는 특정 클래스 내부에 정의되며, 해당 클래스와 밀접하게 연결됩니다.
클래스 이름으로 접근: 컴패니언 오브젝트의 멤버(함수, 프로퍼티)는 클래스 이름을 통해 직접 접근할 수 있습니다. 마치 Java의 정적 멤버처럼 사용할 수 있습니다.
이름 없는 객체: 컴패니언 오브젝트는 이름이 없는 객체입니다. 즉, 별도의 이름을 지정하지 않습니다.
단 하나만 존재: 각 클래스에는 단 하나의 컴패니언 오브젝트만 존재할 수 있습니다.
인터페이스 구현 가능: 컴패니언 오브젝트는 인터페이스를 구현할 수 있습니다.
확장 함수: 컴패니언 오브젝트에 확장 함수를 정의할 수 있습니다. 컴패니언 오브젝트의 용도
팩토리 메서드: 클래스의 인스턴스를 생성하는 팩토리 메서드를 정의하는 데 사용됩니다.
정적 유틸리티 함수: 클래스와 관련된 유틸리티 함수를 정의하는 데 사용됩니다.
정적 상수: 클래스와 관련된 정적 상수를 정의하는 데 사용됩니다.
클래스 레벨의 정보: 클래스 자체에 대한 정보를 제공하는 데 사용됩니다. 컴패니언 오브젝트의 장점 (Java의 static과의 차이점)
객체: 컴패니언 오브젝트는 실제 객체입니다. 따라서 인터페이스를 구현하거나, 확장 함수를 정의하는 등의 객체 지향적인 기능을 활용할 수 있습니다.
이름 없는 객체: 컴패니언 오브젝트는 이름이 없기 때문에, 클래스 이름과 충돌할 가능성이 없습니다.
확장 함수: 컴패니언 오브젝트에 확장 함수를 정의하여, 클래스에 새로운 정적 멤버를 추가할 수 있습니다
</note>

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
