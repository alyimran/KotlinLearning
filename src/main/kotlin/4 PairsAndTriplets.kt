fun main (args:Array<String>){
    //Pair or triplets represent data which consists of two or three values
    // values like these (x,y) , (x,y,z)

    // Pairs
    var cordinates : Pair<Int, Int> = Pair(1,2)
    var cordinates1 = Pair(1,2)  // Type Inference
    var cordinates2 : Pair<Int, Int> = 2 to 3 // using "to" operator

    println("the coordinates are $cordinates")
    println("the x coordinate is are ${cordinates.first}")
    println("the y coordinate is are ${cordinates.second}")


//    Triplets
    var cord3D : Triple<Int, Int, Int> = Triple(1,2,3)
    var cord3D1 = Triple(1,2,3) // type Inference
    println("cords are $cord3D")
    println("x is ${cord3D.first}")
    println("x is ${cord3D.second}")
    println("x is ${cord3D.third}")
}