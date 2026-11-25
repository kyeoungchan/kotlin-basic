/*
// Java랑 비슷하게 생성자를 명시한 버전
class User constructor(_userName: String){
    val userName: String

    init {
        userName = _userName
    }
}
*/
/*
// 약간 간소화한 버전
class User (_userName: String){
    val userName: String = _userName
}
*/

// 최종 버전
class User (val userName: String)

class User2 (
    val userName: String,

    // level 기본값이 생김으로써 생성자가 2개가 되었다.
    val level: Int = 1
)

fun main() {
    println(User("Benny").userName)
    println(User2("Benny").userName)
    println(User2("Noone", 3).userName)
    println(User2("Noone", level = 3).userName)
}