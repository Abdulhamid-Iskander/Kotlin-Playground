fun main(){
    val a = 10
    val b = 3

    val sum = a + b        // 13
    val sub = a - b        // 7
    val product = a * b    // 30
    val div = a / b        // 3  <-- ⚠️ Interview Trap (Integer Division)

    val x = 10
    val y = 3
    val remainder = x % y   // Result: 1

    var i = 5
    val u = i++
    // Post-increment: a = 5, then i becomes 6
//     Now i is 6

    var j = 5
    val n = ++j
    // Pre-increment: j becomes 6, then b = 6
    // Now j is 6
}