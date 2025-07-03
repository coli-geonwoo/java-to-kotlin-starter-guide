package com.lannstark.lec01

/*
- 모든 변수는 var/ val을 붙여주어야 한다
- var : 변경 가능함
- val : 변경가능하지 않음

- 타입을 명시적으로 작성하지 않아도 타입이 추론된다
- primitive type과 Reference type을 구분하지 않아도 된다
- Nullable을 타입 뒤 ?로 표현한다 (아예 다른 타입으로 간주된다)
- 객체 인스턴스화 . new를 붙이지 않아도 된다

 */

fun valAndVar() {
    var number1 = 10L //변할 수 있는 변수
    //var number1 : Long = 10L //타입을 지정해주어도 된다
    number1 = 5L;

    val number2 = 11L //변할 수 없는 변수
//    number2 = 5L -> 에러 발생

    var number3 : Long //초기화되지 않을 경우 타입추론이 가능하도록 타입을 넣어주어야 함
    //println(number3) //초기화하지 않은 변수는 출력 불가

    val number4 : Long
    number4 = 5L //최초 한번 값을 넣어줄 수 있음

    println(number1)
    println(number2)

}

fun primitive() {
    //코틀린에서는 primitive와 reference의 구분이 없다
    //선언은 reference로 하지만 내부적으로 연산 시에는 primitive로 바꾸어 연산해준다
    //즉, 프로그래머가 boxing, unboxing을 고려하지 않아도 되도록 Kotlin이 알아서 처리해준다

    var number1 = 10L
    val number2 = 1000L

    // java에서는 reference type으로 nullable의 타입표현이 가능하지만
    // 코틀린은 nullable함을 아예 다르게 간주하여 '타입?'을 통해 표현한다
    var number3: Long? = 100L;
    number3 = null;
}

//객체의 인스턴스화
fun instance() {
    //코틀린에서는 new를 쓰지 않아야 한다
 var person : Person = Person("김건우")
}
