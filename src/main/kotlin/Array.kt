fun main(){
// 1. Generic Array (Boxed - Heavy)
    val names = arrayOf("Ahmed", "Ali", "Mona")
    val boxedNumbers = arrayOf(1, 2, 3) // Creates Array<Integer>

// 2. Primitive Array (Optimized - Light & Fast)
    val numbers = intArrayOf(1, 2, 3)   // Creates int[]
    val grades = doubleArrayOf(10.5, 90.0)
/*
Kotlin distinguishes between generic arrays (Array<T>) and specialized primitive arrays (IntArray, ByteArray, etc.).
Array<T> represents an array of objects (boxed values),
which incurs memory overhead. Specialized arrays compile down to JVM primitive arrays (e.g., int[]),
providing contiguous memory allocation and better performance
*/
}