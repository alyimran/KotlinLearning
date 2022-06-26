import java.io.IOException

//Kotlin provides an important new type of class that is not present in Java. These are known as sealed classes.
//As the word sealed suggests, sealed classes conform to restricted or bounded class hierarchies.
//A sealed class defines a set of subclasses within it

//It is used when it is known in advance that a type will conform to one of the subclass types.
//Sealed classes ensure type safety by restricting the types to be matched at compile-time rather than at runtime.

// Picking up from enum classes
//To solve this problem, you can inherit from an abstract class. This allows you to represent states differently.

//Replace the enum class LoadState with the code below:

abstract class LoadState1

data class Success(val dataFetched:String?):LoadState1()
data class Error(val exception: Exception):LoadState1()
object NotLoading:LoadState1()
object Loading:LoadState1()


object Repository1 {
    private var loadState:LoadState1 = NotLoading
    private var dataFetched:String? = null

    fun startFetch(){
        loadState = Loading
        dataFetched = "Data"
    }
    fun finishFetch(){
        //passing the dataFetched to Success state.
        loadState = Success(dataFetched)
        dataFetched = null
    }
    fun errorFetch(){
        //passing a mock exception to the loadstate.
        loadState = Error(Exception("Exception"))
    }
    fun getLoadState(): LoadState1 {
        return loadState
    }
}


fun getStateOutput1 (state:LoadState1) {
    return when(state)
    {
        is Error -> println(state.exception.message.toString())
        is Success -> println(state.dataFetched?:"Please make sure that data is fethced")
        is Loading-> {
            println("Still loading...")
        }
        is NotLoading -> {
            println("IDLE")
        }
        //you have to add an else branch because the compiler cannot know whether the abstract class is exhausted.
        else-> println("invalid")
    }
}


//
//Summary of the abstract class use case
//By extending an abstract class instead of using enums, you acquire the liberty to represent your states differently.
//
//Sadly, there was something essential you lost along the way. The restricted set of types of enums. Now, the kotlin compiler is in a fix. It cannot tell whether the when statement’s branches were exhaustive. That is why you had to add else as a branch.
//
//This is where sealed classes come in. They provide the best of both worlds. You get the freedom to represent your states differently and also the restrictions that are typical of enums.


//
//What is a sealed class
//A sealed class is an abstract class with a restricted class hierarchy. Classes that inherit from it have to be in
//the same file as the sealed class.
//
//This provides more control over the inheritance. They are restricted but also allow freedom in state representation.




//In your code, replace the abstract keyword in abstract class LoadState with sealed.
//After that, head over to the else branch in fun getStateOutput().
//
//IntelliJ IDEA has the following error:
//
//'when' is exhaustive so 'else' is redundant here
//This is because a sealed class is restricted. The compiler can tell when all the branches
//in the when statement have been listed. This means you can safely remove the redundant else branch

sealed class LoadState2

data class Success1(val dataFetched:String?):LoadState2()
sealed class Error1:LoadState2(){
    data class CustomIOException(val ioException: IOException):Error1()
    data class CustomNPEException(val npeException:NullPointerException):Error1()
}
object NotLoading1:LoadState2()
object Loading1:LoadState2()


object Repository2 {
    private var loadState:LoadState2 = NotLoading1
    private var dataFetched:String? = null

    fun startFetch(){
        loadState = Loading1
        dataFetched = "Data"
    }
    fun finishFetch(){
        //passing the dataFetched to Success state.
        loadState = Success1(dataFetched)
        dataFetched = null
    }
    private val npeException = NullPointerException("There was a null pointer exception")
    private val ioException = IOException("There was an IO exception")

    fun getLoadState(): LoadState2 {
        return loadState
    }
}


fun getStateOutput2 (state:LoadState2) {
    return when(state)
    {

        is Success1 -> {
            //If there dataFetched is null, return this default string.
            println(state.dataFetched?:"Ensure you startFetch first")
        }
        is Loading1-> {
            println("Still loading...")
        }
        is NotLoading1 -> {
            println("IDLE")
        }
        is Error1.CustomIOException -> {
            println(state.ioException.toString())
        }
        is Error1.CustomNPEException -> {
            println(state.npeException.toString())
        }

    }
}

