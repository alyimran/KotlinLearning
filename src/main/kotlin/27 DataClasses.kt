// Data classes

// Data classes are kotlin's way  of providing very concise immutable data types
// By defining a class as data class, it measn that it is going to generate methods such as equal,
// toString and hashcode automatically for you.
// What this allows us to do is do a quality comparisions on instances of these data classes
// and treat them as equal if the data they contain is equal

// Another really interesting thing that data classes give us are copy constructors

data class MyDataClass(val id:String, val name:String)
class SimpleClass

fun main() {
    var data1 = MyDataClass("1" , "2")
    var data2 = MyDataClass("1" , "2")
    var data3 = data2.copy()
    var data4 = data2.copy(name = "new name")
    println(if (data1==data2) "Equal" else "Not equal")
    println(if (data2==data3) "Equal" else "Not equal")
    println(if (data2==data4) "Equal" else "Not equal")

    //output
    //Equal
    //Equal
    //Not equal

    // The following is checking referential equality
    var sClass1 = SimpleClass()
    var sClass2 = SimpleClass()
    println(if (sClass1 == sClass2)"equal" else "Not equal")
    // output
    //not equal

    // what if we wanted to check referential equalit for data classes?
    // we will use ===
}