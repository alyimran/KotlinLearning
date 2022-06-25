fun main() {
    var myFirstKotlinArray = arrayOf("Ali" , "Imran" , "Bangash")
//    println(myFirstKotlinArray[0])
//    println(myFirstKotlinArray.get(0))

    // How to iterate over the array
//    for (item in myFirstKotlinArray)
//        println(item)

    // But as kotlin supports reactive programming concepts like javascript, we can
    // loop through an array in a more reactive way

//    myFirstKotlinArray.forEach {
//        println(it)
//    }

    // output
//    Ali
//    Imran
//    Bangash
// we can also replace it with our own varriable as below
    myFirstKotlinArray.forEach {item ->
        println(item)
        println("to check")
    }
    // Output
    //Ali
    //to check
    //Imran
    //to check
    //Bangash
    //to check
    // The above function implements lambda syntax which we wll learn later
    // The Idea behind lambda syntax is that if you have a function and its only parameter is a function then you can omit the paranthesis
    // all together and you can pass that funciton in by using opening and closing curly braces
    // so instead of
    //myFirstKotlinArray.forEach((item,index)->{})
    // like in java script we can do like below
    myFirstKotlinArray.forEach { item-> println(item) }


    // Map function
    // returns new array based on criteria passed in the function without modifying the original array
    val myNumbersArray = arrayOf(1,2,3,4,5)
    val myNewNumberArray = myNumbersArray.map { item ->
        item*item
    }
    println(myNewNumberArray)

    // reduce
    val sum = myNumbersArray.reduce{x, y -> x+y}
    println(sum)

    // filter
    var value = myNumbersArray.filter { item ->
        item%2==0
    }
    println(value)

    //every to All
    var isEveryItemEven = myNumbersArray.all { item ->
        item%2==0
    }
    println(isEveryItemEven)

    // some to any
    var isAnyItemEven = myNumbersArray.any{ item -> item%2==0}
    println(isAnyItemEven)





}