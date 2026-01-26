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
//    Fixed Size
val arr =arrayOfNulls<String>(5)
    arr[0]="user1"
    arr[1]="user2"
    arr[2]="user3"
    arr[3]="user4"
    arr[4]="user5"
//  arr[5]="user6"      Error: IndexOutOfBoundsException

//    Array Constructor
    val evenNumber =Array(5){i ->(i*2).toString()}
}