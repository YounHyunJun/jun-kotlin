package jun.kotlin

class Calculator {

    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun mul(a: Int, b: Int): Int {
        return a * b
    }

    fun div(a: Int, b: Int): Int {
        if (b == 0)
            throw Exception("Can not divide by 0")

        return a / b
    }

}

fun main() {
    val a = 4
    val b = 2

    val calculator = Calculator();

    println("합: " + calculator.plus(a, b))
    println("차: " + calculator.minus(a, b))
    println("곱: " + calculator.mul(a, b))
    println("나누기: " + calculator.div(a, b))
}