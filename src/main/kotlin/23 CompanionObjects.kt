import kotlin.time.measureTime

// Now imagine we want to create a factory which creates instances of an object entity
// Now we want to make it a factory so we need to make it's consturctor private
// Now , as we have made the constructor private, we can not create an object of this class, but we want to be able to create
// instanced from this entity. so what do we do?
// That's where companion object comes in handy
// it is just like static in java
// A companion object is an object which is scoped to instance of another class

interface MyInterface1{
    fun getMyName():String{
        return "Ali"
    }
}

class Entity private constructor(val Id:String){

    //Now companion object are like any other class and can inherit other classes as well
    companion object Factory:MyInterface1{
        fun createEntity(Id:String):Entity{
            return Entity(Id)
        }

        override fun getMyName(): String {
            return "Imran"
        }
    }
}

fun main (){
    Entity.Factory.createEntity("1")
    // or
    Entity.Factory.createEntity("2")
    // both are valid

    println(Entity.Factory.getMyName())
}