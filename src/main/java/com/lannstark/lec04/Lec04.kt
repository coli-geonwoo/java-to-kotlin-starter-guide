package com.lannstark.lec04

/*
Lec 04 : 코틀린에서 연산자를 다루는 방법
 */

fun main() {
    compareToWhenComparingObject()
    equalsKotlin()
    operatorOverloading()
}

fun compareToWhenComparingObject() {
    //Java와 다르게 객체 비교 시, 비교 연산자를 사용하면 자동으로 compareTo 호출
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(1000L)

    if(money1 > money2) {
        println("Money1의 금액이 Money2보다 크다")
    }

    if(money1 == money2) {
        println("Money1의 금액이 Money2와 같다")
    }

    if(money1 < money2) {
        println("Money2의 금액이 Money1보다 크다")
    }
}


//javad의 동일성 ==, 동등성 equals
//Kotlin의 동일성 ===, 동등성 ==
fun equalsKotlin() {
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(1000L)

    val equality = money1 === money2
    println("동일성 ===: $equality")

    val equality2 = money1 == money2
    println("동등성 ==: $equality2")
}


// in , not in : 컬렉션 포함여부 판단 가능
// a..b -> a부터 b까지 범위 객체를 생성한다
// a[i] : a에서 특정 index 값을 가져온다

// 연산자 오버로딩
// 객체마다 연산자를 직접 정의 가능

fun operatorOverloading() {
    val money1 = Money(1000L)
    val money2 = Money(2000L)
    println(money1 + money2)
}
