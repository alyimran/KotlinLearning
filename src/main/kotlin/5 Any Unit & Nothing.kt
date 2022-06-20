fun main (){
    // Any, Unit and nothing in kotlin

    //Any
    // Parrent of  Every type in kotlin except null just like object type in java which is the parrent of every type
    // Both of the following are valid kotlin
    val myNumber :Any = 42
    val myString :Any = "asdf"


    //Unit : Just like void in java
    //It only ever represents one value e.g unit object
    //It makes working with generics easier.
    // Every funciton that does not expicitly return anything  returns Unit
    //example following function, both function are same

    //    fun add (){
    //        val c = 1;
    //    }

    //    fun add ():Unit{
    //        val c = 1;
    //    }


    //Nothing : Nothing function never completes
    // Return nothing and do nothing

}