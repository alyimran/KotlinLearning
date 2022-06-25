fun main (){
    // Nullability
    // A nullable value is like a box. You can add a value in it or you can add null to it.
    var name :String? = null
    name = "Ali"

    // Checking for null.

    var number :Int? = 30 // here we are making a box
    //println(number + 1) this production error because you are trying to add 1 to a nullable box not the actual value.
    // so now we need to unbox the value in order to be able to add to it.
    var numberPlusOne :Int = number!! +1; // We will use assertion operator to tell the compiler that we want get the value from the box and
    // add to it and then assign the result to numberPlusOne varriable

    // Now this approach will create null pointer exceptions. For example,
    var value:Int? = null;
    println(value!! +1)
    // This will cause null pointer exception at run time which is not good.
    // So, how to solve it?

}