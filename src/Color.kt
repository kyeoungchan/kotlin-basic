import Color.BLUE
import Color.GREEN
import Color.ORANGE
import Color.RED
import Color.YELLOW
import java.time.Duration
import java.time.LocalDateTime

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun main() {
    println(getKoreanColorName(ORANGE))
    printObject("OBJECT")
    printObjectIf("OBJECT")
    printObject(Duration.ofNanos(1234567L))
    printObject(LocalDateTime.of(2026, 11, 22, 16, 49))
}

fun printObjectIf(obj: Any): Unit = if (obj is String) {
    println(obj.lowercase())
} else {
    println("nothing")
}

fun printObject(obj: Any): Unit = when (obj) {
    is String -> println(obj.lowercase())
    is Duration -> println(obj.nano)
    is LocalDateTime -> println(obj.month)
    else -> println("Unknown Type")
}

fun getKoreanColorName(color: Color): String = when(color) {
    RED,ORANGE -> "빨강 or 오렌지"
    YELLOW -> "노랑"
    GREEN -> "초록"
    BLUE -> "파랑"
}

fun mix(c1: Color, c2: Color) =
    when {
        c1 == RED && c2 == YELLOW -> "오렌지"
        c1 == YELLOW && c2 == BLUE -> "초록"
        else -> throw RuntimeException()
    }

