open class Parent(val familyName: String)

/*
class Child(
    val subName: String,
    familyName: String,
) : Parent(familyName = familyName) {
    constructor(subName: String): this(subName, "")
}
*/

/*
// Java식 생성자 코드. 코틀린에서는 비추 방식
class Child : Parent {
    private val subName: String

    constructor(subName: String): this(subName, "")

    constructor(subName: String, familyName: String): super(familyName) {
        this.subName = subName
    }
}
*/

// 코틀린식 가장 추천하는 형식의 생성자
class Child(
    val subName: String,
    familyName: String = "",
) : Parent(familyName)


class Account {
    var balance: Long = 0
        set(value) {
            if (value < 0 ) throw IllegalArgumentException("Balance can't be negative")
            field = value
        }

    var accountName: String = ""
        get() = "계좌이름:$field"
}

fun main() {
    val account = Account()
    account.balance = 100
    account.accountName = "급여계좌"

    // balance: 100, name: 계좌이름:급여계좌
    println("balance: ${account.balance}, name: ${account.accountName}")
}