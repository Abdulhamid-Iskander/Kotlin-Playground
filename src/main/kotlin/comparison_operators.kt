fun main (){
    val name1 = "Kotlin"
    val name2 = "Kotlin"
    val name3 = null
// 1. Checks content, NOT memory address
    val isEqual = (name1 == name2) // true

// 2. Safe with nulls (No Crash)
    val isNullCheck = (name3 == "Java") // false

///In Kotlin, the == operator checks for 'Structural Equality'.
// It is translated by the compiler into a call to the .equals() function.
// Unlike Java, Kotlin's == is null-safe;
// it checks if the reference is null before calling .equals(),
// preventing NullPointerExceptions
class Car
    val car1 =Car()
    val car2 =Car()
    val car3 =car1

println(car1==car2) // false (Different objects, unless equals is overridden)
println(car1 === car2) // false (Different memory addresses)
println(car1===car3)  // true (Point to the exact same location)

    val a = 10
    val b = 20

// 1. Numeric Comparison
    println(a > b)  // false

// 2. String Comparison (Alphabetical)
    val s1 = "Apple"
    val s2 = "Banana"
    println(s1 < s2) // true (Because 'A' comes before 'B')

    val pass = "123"
    if (pass != "Secret") {
        println("Access Denied")
    }
// The != operator is the logical negation of structural equality.
// It corresponds to !a.equals(b)

    val gpa = 3.5

    if (gpa in 3.0..4.0) {
        println("Excellent")
    }
}