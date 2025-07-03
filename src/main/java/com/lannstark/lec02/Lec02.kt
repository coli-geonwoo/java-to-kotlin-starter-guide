package com.lannstark.lec02

//nullable 체크
fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("String cannot be null")
//    }
//    return str.startsWith("A");
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
        ?: false
}

fun startsWithA4(str: String?) {
    //바로 호출하지 못하게끔 막혀있음
//    str.startsWith("A")
}

//safe call
//null이 아니면 실행하고, null이면 실행하지 않는다(그대로 null)
fun safeCall(str: String?) {
//    str.length //불가능!
    str?.length //가능!
}

//elvis 연산자 ?:
//null일 경우 실행될 연산 정의
fun elvis(str: String?): Int {
    return str?.length ?: 0 //?: null일 경우 0 반환
}

//널 아님 단언!!
//null이 들어오면 NPE 위험 있음
fun assertNotNull(str: String?): Int {
    return str!!.length
}

//자바와 혼용할 때

fun javaMix() {
    val person = Person("coli")
    startsWithA(person.name) //nullable의 경우 에러 발생
    //null에 대한 에너테이션 정보를 코틀린이 이해함
}

fun startsWithA(str:String) : Boolean {
    return str.startsWith("A")
}
