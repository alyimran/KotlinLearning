// In Kotlin we can define varraibles outside of any functions or classes.
// THese are known as top level varriables
var myNameOutSideOfAnyFunctionOrClass = "Ali"

// One of the differences between java and kotlin is that types in kotlin are non null by defalut.
// This means that there is a distinct difference between a string and a nullable string.

// following is a non nullable string
var noNullableString: String = ""
// If i try to do
//var nonNullableString : String = null
// it will give me an error stating null can not be assigned to non nullable type

// Following is a nullable type
// If I try to do this
//var nullableString : String = null
// It will not give any error
var nullableString : String? = ""
fun main (){
    println(myNameOutSideOfAnyFunctionOrClass)
}