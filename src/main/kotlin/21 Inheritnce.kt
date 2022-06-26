// by default classes in kotlin are closed meaning they can not be inherited
// same is true properties and methods as well

open class PersonInfoProviderClass :PersonInfoProvider , SessionInfoProvider
{
    open val MyProperty:String = "dummy property"
    open fun dummyMethod(){

    }
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
class FancyInfoProvder: PersonInfoProviderClass()
{
    // now we can overide the properties and methods of parrent class
    override val MyProperty: String
        get() = "fancy property"

    override fun dummyMethod() {
        super.dummyMethod()
        println("fancy implementation")
    }
    override var perosnInfoProviderString: String
        get() = "Fancy Provider"
        set(value) {}

    override fun PrintPersonInfo(person: YourPerson) {
        super.PrintPersonInfo(person)
        println("fancy provider")
    }
}