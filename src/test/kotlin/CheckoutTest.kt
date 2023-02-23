import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckoutTest {

    private val checkout: Checkout = Checkout()

    @Test
    fun `returns total price for one item A`() {
        val expectedPrice = 50
        val actualPrice = checkout.getTotalPrice('A')

        assertEquals(expectedPrice, actualPrice)
    }

    @Test
    fun `returns total price for one item B`() {
        val expectedPrice = 75
        val actualPrice = checkout.getTotalPrice('B')

        assertEquals(expectedPrice, actualPrice)
    }

    @Test
    fun `returns total price for one item C`() {
        val expectedPrice = 25
        val actualPrice = checkout.getTotalPrice('C')

        assertEquals(expectedPrice, actualPrice)
    }

    @Test
    fun `returns null for a non-existing item`() {
        val expectedResult = null
        val actualResult = checkout.getTotalPrice('Z')

        assertEquals(expectedResult, actualResult)
    }


}