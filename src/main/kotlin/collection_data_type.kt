fun main() {
    // 1. Immutable Collection (Read-Only)
    // Guarantees thread safety and predictability.
    val items = listOf("A", "B", "C")
    
    // 2. Mutable Collection (Read-Write)
    // Backed by dynamic data structures.
    val dynamic = mutableListOf("A", "B")
    dynamic.add("C")

    // Set automatically hashes elements and discards duplicates.
    val set = setOf(1, 2, 2, 3) 
    println(set) // Output: [1, 2, 3]

    val editable = mutableSetOf("A", "B")
    editable.add("A") // Ignored, "A" already exists.
}
