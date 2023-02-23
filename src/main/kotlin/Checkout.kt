class Checkout {
    private val itemsPurchased = mutableMapOf(
        'A' to 0,
        'B' to 0,
        'C' to 0,
        'D' to 0,
        'E' to 0,
    )

    fun getTotalPrice(): Int {
        return itemsPurchased.entries.sumOf { getItemPrice(it.key).times(it.value) }
    }

    fun getItemPrice(item: Char): Int {
        return when(item) {
            'A' -> 50
            'B' -> 75
            'C' -> 25
            'D' -> 150
            'E' -> 200
            else -> 0
        }
    }

    fun addItemToBasket(item: Char, numberOfItem: Int) {
        itemsPurchased.put(item, itemsPurchased[item]!!.plus(numberOfItem))
    }
}