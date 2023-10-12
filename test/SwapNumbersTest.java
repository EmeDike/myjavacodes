// SwapNumbersTest.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapNumbersTest {

    @Test
    public void swapIndex() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] expected = {3, 2, 1, 4, 5};

        SwapNumbers.swapFirstAndSecondIndex(numbers, 0, 2);
        assertArrayEquals(expected, numbers);
    }
}
