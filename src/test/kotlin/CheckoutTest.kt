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
            val actualPrice = checkout.getItemPrice('A')

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item B`() {
            val expectedPrice = 75
            val actualPrice = checkout.getItemPrice('B')

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item C`() {
            val expectedPrice = 25
            val actualPrice = checkout.getItemPrice('C')

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item D`() {
            val expectedPrice = 150
            val actualPrice = checkout.getItemPrice('D')

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns total price for one item E`() {
            val expectedPrice = 200
            val actualPrice = checkout.getItemPrice('E')

            assertEquals(expectedPrice, actualPrice)
        }

        @Test
        fun `returns 0 for a non-existing item`() {
            val expectedResult = 0
            val actualResult = checkout.getItemPrice('Z')

            assertEquals(expectedResult, actualResult)
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
}