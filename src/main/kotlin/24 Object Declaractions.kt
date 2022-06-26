// What are object declarations?
//An object declaration is a convinient way of creating thread safe singletons within kotlin

 object EntityFactory {
     fun createEntity(Id:String):Entity1{
         return Entity1(Id)
     }
 }

class Entity1(val Id:String){
}

fun main (){
   var entity = EntityFactory.createEntity("1")
}