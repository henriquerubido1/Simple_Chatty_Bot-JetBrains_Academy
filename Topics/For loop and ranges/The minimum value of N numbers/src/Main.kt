fun main() {
    val inputSize: Int = readln().toInt()
    var result = readln().toInt()
    for (num in 2..(inputSize)) {
        val next = readln().toInt()
        if (next < result) {
            result = next
        }
    }
    println(result)
}