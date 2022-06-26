// In kotlin, visibility in general are public be default e.g classes, methods, properties
// There are four visibility modifiers
// Public(with class) - this means that it is visible everywhere
// Internal(with class) - This means that this class is public within the module
// Private(with class) - This means that this class is only available in the same file

class YourPerson(val firstName:String = "Ali", val lastName:String="Imran")
{
    // public(with property) - public means it is accessable everywhere
    // internal(with property) - means it is public in same module
    // protected = means that it is only accessbile in this class and subclasses
    // private(with property) - means it is accessible only within this class
    var nickName:String?=null

    // same rules as properties apply to methods as well
    fun printInfo(){
        var nickNameToUse = nickName?:"No nick name found"
        println("$firstName $nickNameToUse $lastName")
    }
}

fun main (){

}