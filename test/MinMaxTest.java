import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {
    @Test
    public void arrayMaximumTest() {
        int[] numbers = {4, 5, 6, 2, 3, 4, 7, 3};
        int max = MinMax.getMaximumOf(numbers);
        assertEquals(7, max);
    }

    @Test
    public void arrayMinimumTest() {
        int[] numbers = {4, 5, 6, 2, 3, 4, 7, 3};
        int min = MinMax.getMinimnumOf(numbers);
        assertEquals(2, min);

    }




}
