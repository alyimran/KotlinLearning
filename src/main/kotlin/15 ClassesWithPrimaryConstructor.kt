// We can define the class as follows
//class Person {
//}
// If there are no properties and no constructor
// we can opit the curly braces as well
//class Person
// but the above class does not have any properties.
// so add the properties,

//class Person(_firstName:String, _LastName:String)
// notice how the above is so much simpler than writting a class in java with constructor
// the above code is equvilant to below code in java
//class Person{
//    Person(Sring _firstName , String _lastName)
//    {
//
//    }
//}

// now we add properties to class
//class Person(_firstName:String,_lastName:String)
//{
//    val firstName:String = _firstName
//    val lastName:String = _lastName
//    // we can also initialize the properties in init block as well
////    init {
////        firstName = _firstName
////        lastName = _lastName
////    }
//}

// The above seems good but kotlin is known for its simplicity that looks like magic
// So we can simply the above class even more

class Person (val firstName:String, val lastName:String)
// And that is it, the above code creates firstname and lastname properties just like in above code

fun main() {
    // both of below are valie
    var person = Person("Ali" , "Imran")
    var person2 = Person(firstName = "Ali" , lastName = "Imran")

    // we can access the properties without need of getter or setter like in java
    // In kotlin this is known as property access syntax
    person.lastName;
    person.firstName;
}