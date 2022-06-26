fun main() {
    // we have a map of function in kotlin
    val map = mapOf(1 to "A" , 2 to "B" , 3 to "C")
    map.forEach{key, value ->
        println("$key -- $value")
    }
}