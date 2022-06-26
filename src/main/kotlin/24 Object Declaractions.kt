// What are object declarations?
//An object declaration is a convinient way of creating thread safe singletons within kotlin

 object EntityFactory {
     fun createEntity(Id:String , Name:String):Entity1{
         return Entity1(Id, Name)
     }
 }

class Entity1(val Id:String , val name:String){
    override fun toString(): String {
        return "$Id"
    }
}

fun main (){
   var entity = EntityFactory.createEntity("1" , "Imran")
}