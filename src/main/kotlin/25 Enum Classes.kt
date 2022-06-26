//‘Enum’ is the short form of ‘Enumerated type’. ‘Enumerated type’ comes from the English word ‘enumerate’.
//To enumerate means to list things one by one. An enumerated type in programming is a type that contains
//a list of elements of the same type as the enumerated type.



object Repository{
    private var loadState:LoadState = LoadState.IDLE
    //Data to be fetched when we startFetch()
    private var dataFetched:String? = null
    fun startFetch(){
        loadState = LoadState.LOADING
        dataFetched = "data"
    }
    fun finishFetch(){
        loadState = LoadState.SUCCESS
        //Return data fetched to its original state
        dataFetched = null
    }
    fun errorFetch(){
        loadState = LoadState.ERROR
    }
    fun getLoadState(): LoadState {
        return loadState
    }
}

enum class LoadState{
    SUCCESS,
    LOADING,
    ERROR,
    IDLE
}

fun getStateOutput (state:LoadState) {
    return when(state)
    {
        LoadState.SUCCESS -> println("Successfully loaded data")
        LoadState.LOADING -> println("Data is loading")
        LoadState.ERROR -> println("Error occured")
        LoadState.IDLE -> println("In Idle state")
    }
}

fun main() {
    Repository.startFetch()
    getStateOutput(Repository.getLoadState())
    Repository.finishFetch()
    getStateOutput(Repository.getLoadState())
    Repository.errorFetch()
    getStateOutput(Repository.getLoadState())
}


//Enum classes are clearly useful when it comes to handling state. They easily keep track of things.
//Now consider the following scenario:
//
//What if you wanted to print a unique success message depending on the data fetched? You may also want to catch unique exceptions in errors.

//To implement the above functionality:
//
//SUCCESS will have to emit a unique string
//ERROR will have to emit a unique exception
//LOADING and IDLE remain generic.
//Using enum classes, we would have to do this:


//enum class LoadState1{
//    SUCCESS(val data:String),
//    LOADING,
//    ERROR(val exception:Exception),
//    NOTLOADING
//}

//The code above produces an error. This is because you can not represent constants differently in an enum class.


// solution? Look in the next sealed class file for that