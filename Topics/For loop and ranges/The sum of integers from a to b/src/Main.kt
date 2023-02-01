fun main() {
    var counter = 0
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()

    for (num in num1..num2) {
        counter += num
    }

    println(counter)
}