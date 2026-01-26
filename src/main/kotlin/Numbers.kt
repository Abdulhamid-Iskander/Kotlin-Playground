fun main() {
    // 1. Integers (Whole numbers)
    val tiny: Byte = 100         // 8-bit
    val small: Short = 10000     // 16-bit
    val standard: Int = 100000   // 32-bit (Default)
    val huge: Long = 10000000L   // 64-bit (Must use 'L')

    // 2. Floating Points (Decimal numbers)
    val precise: Double = 3.14   // 64-bit (Default & Recommended)
    val fast: Float = 3.14f      // 32-bit (Must use 'f' or 'F')
//  On the JVM, Kotlin generates primitive types (int, double)
//  for non-nullable variables whenever possible for performance.
//  However, when using Nullable types (Int?) or Generics (List<Int>),
//  Kotlin forces 'Boxing', wrapping the primitive value inside a Java wrapper class (like java.lang.Integer) stored on the Heap

    val a: Int = 1000        // Primitive (in Bytecode)
    val b: Int? = 1000       // Boxed Object (in Bytecode)
    val c: List<Int> = listOf(1000) // Boxed Object Objects + List
    println("$a $b $c")

//  In Kotlin No Implicit Conversions
    val x: Int = 10
//    val y: Long = x Type Mismatch
    val y: Long = x.toLong()

//    Kotlin disallows implicit widening conversions
//    (e.g., assigning an Int to a Long variable) to prevent loss of precision and unexpected behavior.
//    Developers must invoke explicit conversion functions like toLong(), toDouble(), etc

    val five = 5
    val two = 2

    println(five / two)       // Result: 2  (Not 2.5!)
    println(five.toDouble() / two) // Result: 2.5

//    Division between two integers always results in an integer.
//    The fractional part is truncated (discarded), not rounded. To obtain a floating-point result,
//    at least one of the operands must be explicitly converted to a floating-point type

    val salary = 1_000_000   // One Million
    val creditCard = 1234_5678_9012_3456L
    val result = 10.0 / 0.0   // Infinity
    val error = 0.0 / 0.0     // NaN (Not a Number)

    println(result.isInfinite()) // true
    println(error.isNaN())       // true
}