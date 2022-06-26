// An object expression allows you  to create an anonymous inner class so you don't have create new named classes
// This is really good for click listener if you are working in lets say android development
open class ClassA {
    open var variableA : String ="Class A string"
    open fun myFunc(){
        println("My function called")
    }
}

fun main (){
    var classObjet = object : ClassA() {
        override var variableA: String
            get() = "Object string"
            set(value) {}


        override fun myFunc() {
            println(variableA)
        }
    }

    classObjet.myFunc();
}