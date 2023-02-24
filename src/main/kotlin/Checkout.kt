class Checkout {
    private val itemsPurchased = mutableMapOf(
        'A' to 0,
        'B' to 0,
        'C' to 0,
        'D' to 0,
        'E' to 0,
    )

    private val itemsPrice = mapOf(
        'A' to 50,
        'B' to 75,
        'C' to 25,
        'D' to 150,
        'E' to 200,
    )

    fun getTotalPrice(): Int {
        return itemsPurchased.entries.sumOf { itemsPrice[it.key]?.times(it.value)?: 0 }
    }

    fun addItemToBasket(item: Char, numberOfItem: Int) {
        if (itemsPrice.keys.contains(item)) itemsPurchased.put(item, itemsPurchased[item]!!.plus(numberOfItem))
    }
}