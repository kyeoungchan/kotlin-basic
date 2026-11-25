fun getMyName(
    firstName: String = "foo",
    lastName: String = "bar",
): String = "$firstName $lastName"

const val ONE = 1
const val TWO = 2

fun sum(num1: Int, num2: Int) = num1 + num2

fun main() {
    println(getMyName("Steve", "Jobs"))
    println(getMyName(firstName = "Steve", lastName = "Jobs"))
    // 순서를 지키지 않아도 파라미터 전달 가능
    println(getMyName(lastName = "Jobs", firstName = "Steve"))

    // java와 달리 오버로딩 함수를 굳이 구현 안 해도 됨
    println(getMyName())
    println(getMyName(firstName = "Steve"))
    println(getMyName(lastName = "Jobs"))
}