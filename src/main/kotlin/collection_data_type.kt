fun main() {
    // 1. Immutable Collection (Read-Only)
    // Guarantees thread safety and predictability.
    val items = listOf("A", "B", "C")
    
    // 2. Mutable Collection (Read-Write)
    // Backed by dynamic data structures.
    val dynamic = mutableListOf("A", "B")
    dynamic.add("C")
}
