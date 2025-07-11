package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/*
- try catch finally는 문법적으로 완전히 동일하다
- Kotlin에서는 try catch 가 expression이다
- kotlin에서 모든 예외는 Unchecked Exception이다
- Kotlin에서 try with resources 구문이 없다
    - 대신 코틀린의 언어적 특징을 활용해 close를 호출한다
 */

fun main() {
//    println(parseIntOrThrow("5e"))
//    readFile()
    val printer = FilePrinter()
    printer.readFile("./a.txt")
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()

    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 문자열 ${str}은 숫자가 아닙니다")
    }
}

//변환에 실패하면 null 반환
//try-catch 같은 경우도 하나의 statement로 간주됨
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

//checked exception과 unchecked exception
//코틀린에서는 모두 Unchecked Exception이다
//IOExcepton을 잡아주지 않아도 된다
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath+"/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

//try-with-resource
//.use를 대신 사용함

