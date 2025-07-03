package com.lannstark.lec03

/*
Lec 03 코틀린에서 Type을 다루는 방법
- 코틀린의 변수는 초깃값을 보고 타입을 추론한다
- 기본 타입 간 변환은 명시적으로 이루어진다
- 코틀린에서는 is !is as as? 등을 이용해 타입 확인 및 캐스팅한다
- 코틀린의 Any는 java의 Object와 같은 최상위 타입이다
- 코틀린의 Unit은 Java의 void와 동일하다
- 코틀린의 Nothing은 정상적으로 끝나지 않는 함수의 반환을 의미한다
- 문자열을 가공할 때 ${변수} / """ """을 이용하면 깔끔한 코딩이 가능하다
- 문자를 가져올 때 Java 배열처럼 [] 을 사용한다
 */

fun main() {
//    type_casting2(Person("김건우", 10));
//    type_casting2(null);
//    string_interporlation()
//    string_append()
    string_indexing()
}

@SuppressWarnings("unused")
fun type1() {
    //코틀린은 선언된 기본값으로 타입을 추론한다
    val number1 = 3 //Int 간주
    val number2 = 3L //Long 간주

    val number3 = 3.0f //Float 간주
    val number4 = 3.0 //Double 간주
}

@SuppressWarnings("unused")
fun type_switching() {
    //코틀린에서 타입 변환은 명시적으로 이루어져야 한다
    val number1 : Int? = 4;
    val number2 : Long = number1?.toLong() ?: 0L //toType()과 같이 명시적 형변환이 이루어져야 함
}

fun type_casting(obj: Any) {
    //instanceof , (Person) 등등
    //instanceof -> is
    //as Person > (Person)
    if(obj is Person) {
        val person : Person = obj as Person;
        println(obj.age); //스마트 캐스트가 가능함
    }

    if(obj !is Person) {
        val person : Person = obj as Person;
        println(obj.age); //스마트 캐스트가 가능함
    }
}

fun type_casting2(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.age);
}

/*
Kotlin의 특이한 역할 3가지(Any, Unit, Nothing)

- Any
    - Java의 Object 역할로 최상위 타입 + Primitive type도 포함
    - Any 자체로는 nullable 표현이 불가해 Any?로 작성
    - Any에 eq&hc / toString 존재
- Unit
    - void와 동일
    - void와 다르게 그 자체로 타입 인자로 사용가능
    - 함수형 프로그래밍에서 Unit은 인스턴스만 갖는 타입을 의미
    - 코틀린의 Unit은 실제 존재하는 타입
- Nothing
    - 정상적으로 끝나지 않았다는 사실을 표현
    - 무조건 예외를 반환하는 함수 등
 */

fun string_interporlation() {
    val person = Person("coli", 100);
    val header = "오늘의 일기"
    val log = "${header} 이름 : ${person.name}, 나이 : ${person.age}"
    println(log)
}

fun string_append() {
    val name = "김건우";
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)
}

fun string_indexing() {
    //java - str.charAt(1)
    //kotlin - str[1]
    val str = "ABC"
    println(str[1])
    println(str[2])
}
