fun printAnything(obj: Any) {
    println(obj)
} // function accept any things
fun main (){
    val name: Any = "Ahmed"   // Works
    val age: Any = 25         // Works
    val isDev: Any = true     // Works

    /*Any is the root of the Kotlin class hierarchy.
     Every class in Kotlin has Any as a superclass,
     either implicitly or explicitly.
    It corresponds to java.lang.Object in Java, but with fewer methods*/

    val obj: Any = "Test"
    obj.toString()
    obj.hashCode()
    obj.equals("A")

    val x: Any = "Hello"
    val y: Any? = null   // Correct
}