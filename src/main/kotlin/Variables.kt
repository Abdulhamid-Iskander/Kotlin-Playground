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

}