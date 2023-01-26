package s2319.shopiee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopieeTest {
    @Test
    public void shouldReturnPriceForProduct() {
        Storage storage = new Storage();

        assertEquals(4.0, storage.getPrice("milk"));
        assertEquals(6.0, storage.getPrice("beer"));
    }

}