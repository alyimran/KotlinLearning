

fun main() {
    var myFirstKotlinArray = arrayOf("Ali" , "Imran" , "Bangash")
    var myFirstKotlinList = listOf("Ali" , "Imran" , "Bangash")
//    println(myFirstKotlinArray[0])
//    println(myFirstKotlinArray.get(0))

    // How to iterate over the array
    for (item in myFirstKotlinArray)
        println(item)

    for (item in myFirstKotlinList)
        println(item)

    // But as kotlin supports reactive programming concepts like javascript, we can
    // loop through an array in a more reactive way

    myFirstKotlinArray.forEach {
        println(it)
    }
    // output
//    Ali
//    Imran
//    Bangash

    myFirstKotlinList.forEach{
        println(it)
    }
    // output
//    Ali
//    Imran
//    Bangash

// we can also replace it with our own varriable as below
    myFirstKotlinArray.forEach {item ->
        println(item)
        println("to check")
    }

    myFirstKotlinList.forEach{item ->
        println(item)
        println(item)
    }
    // Output for both
    //Ali
    //to check
    //Imran
    //to check
    //Bangash
    //to check

    //There is anoter way in which we get the index as well
    myFirstKotlinArray.forEachIndexed { index, myString ->
        println("$index  $myString")
    }
    myFirstKotlinList.forEachIndexed{index , mystring ->
        println("$index $mystring")
    }

    // The above function implements lambda syntax which we wll learn later
    // The Idea behind lambda syntax is that if you have a function and its only parameter is a function then you can omit the paranthesis
    // all together and you can pass that funciton in by using opening and closing curly braces
    // so instead of
    //myFirstKotlinArray.forEach((item,index)->{})
    // like in java script we can do like below
    myFirstKotlinArray.forEach { item-> println(item) }
    myFirstKotlinList.forEach {item -> println(item)}

    // Map function
    // returns new array based on criteria passed in the function without modifying the original array
    val myNumbersArray = arrayOf(1,2,3,4,5)
    val myNewNumberArray = myNumbersArray.map { item ->
        item*item
    }
    println(myNewNumberArray)

    val myNewNumbersList = myNumbersArray.map { item ->
        item *item
    }

    // reduce
    val sum = myNumbersArray.reduce{x, y -> x+y}
    println(sum)
    val listSum = myNumbersArray.reduce{x, y -> x+y}

    // filter
    var value = myNumbersArray.filter { item ->
        item%2==0
    }
    println(value)

    var listValue = myNumbersArray.filter { item ->
        item%2==0
    }

    //every to All
    var isEveryItemEven = myNumbersArray.all { item ->
        item%2==0
    }
    println(isEveryItemEven)


    var isEveryItemEvenList = myNumbersArray.all { item ->
        item%2==0
    }
    println(isEveryItemEvenList)

    // some to any
    var isAnyItemEven = myNumbersArray.any{ item -> item%2==0}
    println(isAnyItemEven)

    var isAnyItemEvenList = myNumbersArray.any{ item -> item%2==0}
    println(isAnyItemEvenList)





}