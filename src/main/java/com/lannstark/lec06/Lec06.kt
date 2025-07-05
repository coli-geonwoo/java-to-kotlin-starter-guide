package com.lannstark.lec06

/*
[Lec06. 코틀린에서 반복문을 다루는 방법]
- for each 문에서 kotlin은 in을 사용한다
- 전통적인 for 문에서 등차수열과 in 을 사용한다
 */

fun main() {
    numberList()
    increase()
    decrease()
    step2()
}

//in 절
fun numberList() {
    val numbers = listOf(1L, 2L, 3L)

    for(number in numbers) {
        println(number)
    }
}

// ..으로 출력 가능
fun increase() {
    for(i in 1..3) {
        println(i)
    }
}

// downTo
fun decrease() {
    for( i in 3 downTo 1 step 2){
        println(i)
    }
}

//step
//downTo와 step도 함수이다
// 1-5, 공차 1인 등차수열.step(2)
fun step2() {
    for(i in 1..5 step 2){
        println(i)
    }
}

//while은 완전히 동일하다
fun whileKotlin() {
    var i =0
    while(i<=3){
        println(i)
        i++
    }
}
