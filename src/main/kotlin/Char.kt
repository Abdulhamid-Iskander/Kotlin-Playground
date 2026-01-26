fun main(){
    val latter : Char ='A'
    // val wrong: Char = "A" // Error: Double quotes are for Strings
    // val number: Char = 65 // Error: Cannot assign number directly
    /*
     The Char type represents a 16-bit Unicode character.
     Unlike Java or C++,
     Char in Kotlin is a distinct type and is NOT treated as a number.
     You cannot assign an integer literal directly to a Char variable without explicit conversion
    */
    val charA = 'A'

// 1. Adding an Int to a Char -> Returns a new Char
    val charB = charA + 1   // Result: 'B'

// 2. Subtracting a Char from a Char -> Returns an Int (Distance)
    val distance = 'Z' - 'A' // Result: 25

// 3. Incrementing
    var letter = 'a'
    letter++                 // Becomes 'b'
}