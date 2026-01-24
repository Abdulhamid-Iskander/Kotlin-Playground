fun main(){
    var name = "Medo"
    var Languages : String = "Kotlin , Dart"
    println("Your name is $name and languages $Languages")
    // Functions
    println(name.uppercase())
    println(name)

    //Strings in Kotlin are immutable objects. Once a String object is created in the memory (Heap),
    // its character sequence cannot be changed.
    // Methods like uppercase() do not modify the original string; instead,
    // they return a completely new String object
     var upper = name.uppercase()
     println(upper)
    val age = 20
    val msg = "My age is $age, next year I'll be ${age + 1}"
    println(msg)
// Kotlin supports String Interpolation (Templates).
// The $ symbol is used for variable injection,
// and ${} is used for evaluating arbitrary expressions directly within the string literal.
// This is compiled into a highly optimized StringBuilder append sequence


val s1 = "Hello"
val s2 = "Hello"
val s3 = String("Hello".toCharArray()) // new object

println(s1 == s2)   // true
println(s1 === s3)  // false

//In Kotlin, the == operator checks for Structural Equality (calls .equals()),
// meaning it compares the content.
//The === operator checks for Referential Equality,
meaning it checks if both variables point to the exact same object in memory.
}