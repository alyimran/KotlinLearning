class MyPerson(val firstName:String = "Ali", val lastName:String="Imran")
{
    // above properties are immutable so we only have getters for them
    //lets introduce mutable properties
    //Properties in kotlin get their setters and getters generated by compiler
    //But we can define our own setters and getters
    var nickName:String?=null
        set(value) {
            field=value
            println(value)
        }
        get(){
            println(field)
            return field
        }
    fun printInfo(){
       // var nickNameToUse = if (nickName!=null) nickName else "No nick name found"
        // as the above scenario comes up a lot in practical applications we have a shorter syntax for it
        // this is called elvis operator
        var nickNameToUse = nickName?:"No nick name found"
        //above statement says if whats on the right side is not null, return it else return whats on the right side
        println("$firstName $nickName $lastName")
    }

}

fun main(){
    var person = MyPerson()
    person.printInfo()
}