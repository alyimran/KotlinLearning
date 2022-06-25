fun main (){
    // When expression
    // it is just like swith statement
    // we check different values of number passed to when expressing and do something the number has that value
    // var value = "A"
    //    swith(value){
    //        case "A":
    //        //do somththing
    //        case "B":
    //        //do something
    //        default:
    //        // Do somthing
    //    }

    // same is the case with when but with just a different syntax. Plus there is no need to use break statements in when expression
    // In kotlin, there is no swith statement
    val number = 10;
    when (number){
        1-> println("1")
        else -> println("Non zero")
    }

    // We can also add multiple conditions. Look at the example below
    val value = "sallo"
    when(value){
        "Imran" , "Bangash" , "Khan" -> println("Master")
        "sallo" -> println("sa")
        else -> println("Not Master")
    }

    // Now notice that i keep on saying when expression!!!
    // This is because it is an expression which can return values as well
    // Look at the following example

    val myValue = 9;
    val myNum = when(myValue){
        1-> "one"
        2-> "two"
        9->"nine"
        else -> "Not found"
    }
    println(myNum)

    // when can also be used without passing anything to it
    // for example
    var point = Triple(1,2,3)
    var result =when {
        point.first == point.second -> "First two are equal"
        point.second == point.third -> "sec9hd two are equal"
        else -> "No one is equal"
    }

    println(result)

    // If statement can also be used as an expression
    var myName : String? = null

    var myNameTobe : String? = if (myName!=null) myName else null
    println(myName)
    //output
    // null
}

