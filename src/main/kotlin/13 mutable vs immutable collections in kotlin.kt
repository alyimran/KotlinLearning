fun main() {
    // Kotlin by default has immutable collections just like it has non-nullable value types
    // lets see the following
    var list = listOf("ali" , 1 ,  'A')
    // now there is no way to add or delete any value from above. same is true for sets or maps
    // so if we want to have a mutalble  list or list we can do as below
    var list2 = mutableListOf("imran",2 , 'B')
    list2.add("Bangash")

    // Same for maps
    var map = mutableMapOf(1 to "1" , 2 to "2")
    map.put(3, "3")
}