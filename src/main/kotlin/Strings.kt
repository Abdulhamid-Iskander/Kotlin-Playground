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
}