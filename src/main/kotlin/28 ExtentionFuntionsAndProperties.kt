class MyDummyClass

fun MyDummyClass.DummyExtentionMethod() {
    println("My dummy extention method")
}

var MyDummyClass.Name: String
    get() = "Ali"
    set(value) = TODO()

fun main (){
    var dummyCObject = MyDummyClass()
    dummyCObject.DummyExtentionMethod()
}