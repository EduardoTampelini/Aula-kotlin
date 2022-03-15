fun main(args: Array<String>) {
    var neverNull: String = "this can't be null"

    neverNull = null

    var nullable: String? = "you can keep a null here"

    nullable = null

    var inferredNonNull = "the compiler assumes non-null"

    inferredNonNull = null

    fun strLength (notNull: String): Int{
        return notNull.length
    }

    strLength(neverNull)
    strLength(nullable)
    //printMessage("Hello")
    //printMessageWhithPrefix("hello", "Log")
    //printMessageWhithPrefix("hello")
    //printMessageWhithPrefix(prefix = "Log", message = "Hello")
    //println(sum(1,2))
    //println(multiply(2,4))
    //println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

}
fun printMessage(message: String): Unit{
    println(message)
}
fun printMessageWhithPrefix (message:String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}
fun multiply(x: Int, y: Int) = x * y

