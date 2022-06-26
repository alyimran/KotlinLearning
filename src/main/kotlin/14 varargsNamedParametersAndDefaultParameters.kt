fun main() {
    // vararg represents varriable number of aruguments.
    // We use it when we want the flexibility to pass any number of arguments to a function
    sayHello("Hello" , "hi" , "bye" )
    // or
    sayHello("Hello")
    // so by using vararg we eliminated the need to always pass values after greeting parameter

    // but lets just say we have scenario in which we want to pass the array to this say  hello function.
    // How do we acheive that? we do that by using spread operator
    // Yes, like in java script spread operator (...) here it is denoted by (*)
    var array = arrayOf("Ali" , "Imran" , "Bangash")
    //sayHello("Hello" , array) this gives error
    sayHello("Hello" , *array) // now it works


    // Named arguments
    // We can use named parameters to tell explicityly that which value should go in which parameter
    sayHello(greeting = "hello" , name = "Ali")
    // That's cool but whats big deal? It allows us to change the order of parameters as well
    sayHello(name = "Ali" , greeting = "Hello")

    // Kotlin in its flexibility allows us to go one step further
    // It allows us to define default values to parameters
    sayHello( name = "ali")

    // All the above allows us to kind of duplicate the functionality of builder pattern without the need to define all
    // those setters and getters ann all that stuff
}

fun sayHello (greeting:String, vararg values: String){
    println(greeting)
    values.forEach { item ->
        println(item)
    }
}


fun sayHello (greeting:String = "Hello", name:String){
    println("$greeting $name")
}