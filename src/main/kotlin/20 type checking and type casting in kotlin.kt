interface PersonInfoProvider{
    var perosnInfoProviderString :String

    fun PrintPersonInfo(person: YourPerson){
        println(perosnInfoProviderString)
        person.printInfo()
    }
}

class PersonInfoClass :PersonInfoProvider , SessionInfoProvider
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
        return "session"
    }
}

fun main (){
    var person = PersonInfoClass()
    person.PrintPersonInfo(YourPerson())
    checktypes(person)
}

fun checktypes (personInfoProvider:PersonInfoClass){
    // you can also use !is for reverse conditions
    if (personInfoProvider is SessionInfoProvider)
        println("It is session info provider")
    else{
        println("it is not a session info provder")
    }
}
