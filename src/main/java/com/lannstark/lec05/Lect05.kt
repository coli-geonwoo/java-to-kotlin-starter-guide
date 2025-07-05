package com.lannstark.lec05
/*
[Lec05 요약]
- if, if-else, if-else if - else 모두 Java 문법과 동일하다
- kotlin에서는 expression으로 취급된다 (삼항연산자가 없다)
- java에서 switch는 when으로 대체되었다
 */


// 코틀린의 if문은 자바와 같다
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("{$score}는 0보다 작을 수 없습니다")
    }
}

//else 코드도 같다
// java에서 if-else는 Statement이지만
// kotlin은 Expression이기에 하나의 값을 반환하는 식(like 삼항연산자)처럼 쓸 수 있다
fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}

fun getPassOrFail2(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

//특정 변수 포함 여부
// java  [0 <= score && score <=100]
// kotlin [score in 0..100]
fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("{$score}이 범위 바깥에 습니다")
    }
}

//switch 문과 when
//when 도 하나의 expression
/*
when(값) {
  조건부  -> 값
}
 */
fun getGradeWithSwitch(score: Int): String {
//    return when (score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }

    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// 1, 0, -1 등의 동등문도 가능
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

//early return 처럼 활용도 가능함
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수 입니다")
    }
}
