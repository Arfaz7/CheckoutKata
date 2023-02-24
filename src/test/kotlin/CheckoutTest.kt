import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class CheckoutTest {

    private val checkout: Checkout = Checkout()

    @Nested
    inner class SingleItemPrice {
        @Test
        fun `returns total price for one item A`() {
            val expectedPrice = 50
            checkout.addItemToBasket('A', 1)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item B`() {
            val expectedPrice = 75
            checkout.addItemToBasket('B', 1)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item C`() {
            val expectedPrice = 25
            checkout.addItemToBasket('C', 1)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item D`() {
            val expectedPrice = 150
            checkout.addItemToBasket('D', 1)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item E`() {
            val expectedPrice = 200
            checkout.addItemToBasket('E', 1)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns 0 when adding a non-existing item to the basket`() {
            val expectedResult = 0
            checkout.addItemToBasket('Z', 1)
            val actualResult = checkout.getTotalPrice()

            assertEquals(expectedResult, actualResult)
        }

        @Test
        internal fun `returns 0 when basket is empty`() {
            val expectedPrice = 0
            val actualPrice = checkout.getTotalPrice()
            assertEquals(expectedPrice, actualPrice)
        }
    }

    @Nested
    inner class MultipleSameItemPrice {
        @Test
        fun `return total price for 2 items A`() {
            val expectedPrice = 100
            checkout.addItemToBasket('A', 2)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }
    }

    @Nested
    inner class MultipleDifferentItemPrice {
        @Test
        fun `return total price for one item A and one item B`() {
            val expectedPrice = 125
            checkout.addItemToBasket('A', 1)
            checkout.addItemToBasket('B', 1)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `return total price when we have one of each item in the basket`() {
            val expectedPrice = 500
            checkout.addItemToBasket('A', 1)
            checkout.addItemToBasket('B', 1)
            checkout.addItemToBasket('C', 1)
            checkout.addItemToBasket('D', 1)
            checkout.addItemToBasket('E', 1)
            val actualPrice = checkout.getTotalPrice()

            assertEquals(expectedPrice, actualPrice)
        }
    }
}