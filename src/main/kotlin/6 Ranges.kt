// Advanced control flow
fun main (){
    // Ranges  Represent a sequence of countable integers
    //Closed Range
    val cR = 0..5 // 0 to 5 inclusive 0,1,2,3,4,5
   // println(cR)

    //Half open range
    val hor = 0 until 5 // 0 to 4 , 5 is excluded 0,1,2,3,4

    // Decreasing Ranges
    var dr = 5 downTo 0 // 5,4,3,2,1,0

    // These are the ranges, they are mostly used in for loops and when expressions,

    // Loops
//    for (i in 1..10)
//        println(i)
    // If you want to jump or skip some iterations
//    for (i in 1..10 step 2)
//        println(i)

    //Out put
//    1
//    3
//    5
//    7
//    9

    // Inverse loop with down to keyword
//    for (i in 10 downTo 1 step 2)
//        println(i)
//    output
//    10
//    8
//    6
//    4
//    2

    // Exercise
    for(i in 1..5)
    {
        for(j in 1..5)
            print(i*j)
        println()
    }
}