// As you can see these functins are not defined inside of any class.
// These are all known as Top level functions. Just like varriables, functions can be defined without being associated to any class.

fun main (){
    myFunc("Ali")
    // Method overloading depends on two things
    // Type of parameters and number of parameters

    // Functions as varriables
    // Functions in kotlin are simply another datatype. You can assign them to varriables , pass them to functions

    // How do we use them as varriables?
    // By using method reference operator  ::
    var addFunc = ::add
    // obove statement now stores the add function as a type in addType varriable
    // we can use the obove function as follows
    println(addFunc(1, 2))

    // I can also pass this function type to another function as well
    printResult(addFunc, 1,2)

}

fun add (a:Int, b:Int):Int{
    return a+b;
}
fun myFunc (name:String){
    println(name)
}
fun printResult (func:(Int, Int)->Int , a:Int, b:Int){
println(func(a, b))
}
// Functions support type inference as well
//if i want to return null from my greetings funciton, one way would be to define it in type
//fun getGreetings(): String? {
// return  "Hello Ali"
// }
// Additionally , when we are returning only single value from a function, we can remove the braces and return statement as follow
//fun getGreetings () : String= "Hello Ali"
// This is known as single function expression

// Now this is where type inference comes into play. we can just remove the type from the function as follows
// now our function will infer that it's return type is string.
fun getGreetings () : String= "Hello Ali"
// An other exampe
fun printMyName(name:String) = println(name)

