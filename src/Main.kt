var i: Int = 123
var j = 321
var age = 26


fun sumMain(a: Int, b: Int) = a + b

fun main() {
    age = 25
    print("age is ${sumMain(age, 3)}")
}