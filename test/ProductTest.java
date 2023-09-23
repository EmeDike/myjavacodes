// ProductTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testMultiplyPositiveNumbers() {
        int result = ProductCalculation.multiply(3, 4);
        assertEquals(12, result);
    }
    }
