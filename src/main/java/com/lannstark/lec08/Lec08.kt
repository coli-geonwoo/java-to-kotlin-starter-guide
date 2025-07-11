package com.lannstark.lec08

fun main() {
    repeat("Hello World")

    //named parameter
    //함수를 호출하는 측에서 어떤 파라미터에 무엇을 넣을지 호출 가능
    repeat("Hello World2", useNewLine = false)

    //builder를 만들지 않고도 builder처럼 명확한 파라미터 지정이 가능하게 해줌
    printNameAndGender(name = "김건우", gender = "남")

    //코틀린에서 자바함수를 가져다 사용할 때는 name parameter 사용 불가
    //자바가 바이트코드로 변환될 때 파라미터 이름을 가지고 있지 않기 때문
//    Lec08Main.repeat(str = "Hello World", useNewLine = false, num =3)

    printAll("a", "b","c")

    // 배열을 쓸 땐 스프레드 하여 넣어주어야 함
    // 스프레드 연산자(*) 배열에 있는 값들을 ,로 연결되어 있는 것처럼 펼쳐줌
    val array = arrayOf("a", "b", "c")
    printAll(*array)
}

fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b

// = 을 쓸 경우에는 반환형을 생략할 수도 있다
fun max3(a: Int, b: Int) = if (a > b) a else b


//default parameter
//오버로딩을 통해 처리했던 것을 디폴트값을 넣어서 처리 가능

fun repeat(
    str: String,
    num: Int = 3, //기본값 3
    useNewLine: Boolean = true //기본값 true
) {
    //default 값 2개 설정 가능

    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

//가변인자
//java String... -> 배열로 취급
//kotlin : varargs
fun printAll(vararg strs: String) {
    for (str in strs) {
        println(str)
    }
}
