package s2319.shopiee;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopieeApplicationTests {

    @Test
    public void testCheckoutSuccess() {
        // Given
        User user = new User(100.0, 1);
        Cart cart = new Cart(user);
        // When
        cart.addItem("pierogi");
        cart.addItem("milk");
        cart.addItem("milk");
        // Then
        boolean success = cart.checkout();
        assertTrue(success);
        assertEquals(92.0, user.getBalance());
    }

    @Test
    public void testCheckoutFail() {
        // Given
        User user = new User(5.0, 2);
        Cart cart = new Cart(user);

        // When
        cart.addItem("beer");
        cart.addItem("beer");
        cart.addItem("beer");

        // Then
        boolean success = cart.checkout();
        assertFalse(success);
        assertEquals(5.0, user.getBalance());
    }
}