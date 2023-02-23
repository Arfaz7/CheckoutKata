class Checkout {
    fun getTotalPrice(item: String): Int {
        return if (item == "A") 50 else 75
    }
}