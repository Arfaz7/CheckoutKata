class Checkout {
    fun getTotalPrice(item: Char): Int? {
        return when(item) {
            'A' -> 50
            'B' -> 75
            'C' -> 25
            else -> null
        }
    }
}