const val MAX_RETRY = 3 // ✅

fun main(){
// Immutable Variable (val)
    val id = 20230152
// Mutable Variable (var)
    var score = 9
// val creates a read-only reference (immutable reference),
// meaning the reference cannot be reassigned.
// var creates a mutable reference that can be reassigned multiple times
// If you store an object in a variable of type val,
// you can change the values of the object itself.

//    const val APP_VERSION = "1.0.0"
//    Const modifiers require values to be resolvable at compile-time
//    and must be statically accessible.
//    Local variables, however, are allocated dynamically on the stack frame at runtime
//    when the function is invoked

//Compile-time constants must be declared at the top level of a file,
// or inside an object or a companion object.
// They cannot be declared inside a class body or a function.
 // Data types
//    Kotlin provides signed fixed-width integers: Byte (8-bit),
//    Short (16-bit), Int (32-bit), and Long (64-bit).
//    The default inference for non-decimal numbers is always Int.
//    If the number exceeds Int range,
//    you must denote it with the 'L' suffix to specify Long.
    val age :Int = 21


    val isOnline: Boolean = true
    val isFinished: Boolean = false

    val letter : Char = 'A'
    val name :String = "Kotlin"
//Char represents a single 16-bit Unicode character
// and is defined using single quotes.
// String represents an immutable sequence of characters
// and is defined using double quotes

//    String is strictly an Object in Kotlin (and Java).
//    However, Byte, Int, Double, Boolean, and Char can be optimized
//    by the compiler to act as primitives in the bytecode for performance,
//    but String is always an Object

}