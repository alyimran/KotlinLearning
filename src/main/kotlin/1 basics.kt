// Kotlin is a statically typed language developed by jetbrains. It's been around since 2011

 

fun main(args: Array<String>) {
    println("Hello ali")

    // how to create constants/ Read only varriables. They can not be reassigned.
    val a:Int = 10
    val pi:Double = 20.9
    val k : Float = 30.8f

    // how to create varriable
    var number :Int = 10
    number = 20;
    //number = "" this will cause error obviously

    


    // Type conversion
    var aValue :Int = 10;
    var bValue :Double=20.2
    // Now if i want to convert double to int, i can do it as follows
    aValue = bValue.toInt();

    // Notice, in kotlin  you only has Int, and Doube e.g object type while java had int and Int both.
    // Kotlin takes care of that for you internally.


    //Char
    var myChar:Char = 'K'

    // Boolean
    var myBool :Boolean = true;
    // Notice here, if we do not provide the type of the var, it will ve inferred automatically just like in JS
    var myBool1 = true
    println(myBool1)
}