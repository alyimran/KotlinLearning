// this is the shortes possible form of interface. It is valid. It can still be used as marker interface
// and classes can implemnet it as follows
interface MyInterface

class MyClass : MyInterface

interface PersonInfoProviderInterface{
    // as soon as we define a function in this interface, Person info class will begin to give error that Person Info is
    // Not abstract or implements PersonInfoProvidreInterface
    // So to sove the issue we can either make the class abstract or we can implement the interface
    // In kotlin , interfaces can give default implementations for methods and properties

   // var perosnInfoProviderString:String = "" // this line will give eroor saying that properties can not be initialized in interfaces so you have to overide it in subclass

    var perosnInfoProviderString :String

    fun PrintPersonInfo(person: YourPerson){
        // notice that we have overriden the property but still are using the default implementation in interface
        println(perosnInfoProviderString)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId():String
}

//We could also make it abstract
//abstract class PersonInfo :PersonInfoProviderInterface{
//
//}


class PersonInfo :PersonInfoProviderInterface , SessionInfoProvider
{
    override var perosnInfoProviderString: String
        get() = "BasicInfoProvider"
        set(value) {}

    // we can now over ride the print info function
    override fun PrintPersonInfo(person: YourPerson) {
        super.PrintPersonInfo(person)
        println("overriden prinpersoninfo method")
    }

    override fun getSessionId(): String {
        return "Session"
    }
}

fun main (){
    var person = PersonInfo()
    person.PrintPersonInfo(YourPerson())
    println(person.getSessionId())
}
