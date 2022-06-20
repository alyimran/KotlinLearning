fun main (){
    myFunc("Ali")
    // Method overloading depends on two things
    // Type of parameters and number of parameters

    // Functions as varriables
    // Functions in kotlin are simple another datatype. You can assign them to varriables , pass them to functions

    // How do we use them as varriables?
    // By using method reference operator  ::
    var addType = ::add
    // obove statement now stores the add function as a type in addType varriable
    // we can use the obove function as follows
    println(addType(1, 2))

    // I can also pass this function type to another function as well
    printResult(addType, 1,2)

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

