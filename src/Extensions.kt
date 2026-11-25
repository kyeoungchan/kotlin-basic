// String에 대한 확장 함수
fun String.double() = this + this

// String에 대한 중위 함수
infix fun String.add(postfix: String) = this + postfix

// fun double(str: String) = str + str

fun main() {
    // String.double() 확장 함수에 의해 생성됨
    println("TTOO".double())

    // maxOrNull도 Iterable 확장 함수로 생성함.
    println(setOf(1,3,4,522,344,4).maxOrNull())

    println("My Name Is ".add("Snow"))
    println("My Name Is " add "Snow") // 중위 함수여서 가능한 문법

    // 아래의 to도 마찬가지로 중위 함수다.
    println(
        mapOf(
            "key" to "value",
            "key2" to "value2",
        )
    )

    // 구조 분해
    val (firstName, lastName) = Pair("Snow", "Man")

    mapOf(
        "key" to "value",
        "key2" to "value2",
    ).forEach {
        (key, value) -> println("$key: $value")
    }
}