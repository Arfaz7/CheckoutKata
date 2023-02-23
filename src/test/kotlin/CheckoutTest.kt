import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckoutTest {

    private val checkout: Checkout = Checkout()

    @Test
    fun `returns total price for one item A`() {
        val expectedPrice = 50
        val actualPrice = checkout.getTotalPrice("A")

        assertEquals(expectedPrice, actualPrice)
    }

    @Test
    fun `returns total price for one items B`() {
        val expectedPrice = 75
        val actualPrice = checkout.getTotalPrice("B")

        assertEquals(expectedPrice, actualPrice)
    }
}