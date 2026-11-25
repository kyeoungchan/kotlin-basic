interface Clickable {
    fun click(): Unit
}

class Button: Clickable {
    // 인터페이스를 구현할 때 메서드에 꼭 override 키워드를 붙여야한다.
    override fun click() {
        println("Button is clicked")

        // private 메서드 호출 가능
        internalPrint()
    }

    private fun internalPrint() {
        println("Internal Out")
    }
}

fun main() {
    Button().click()

    // class 내부의 private이므로 호출 안됨
//    Button().internalPrint()

    // 파일 내부에서는 호출 가능
    internalPrint2()
}

private fun internalPrint2() {

}