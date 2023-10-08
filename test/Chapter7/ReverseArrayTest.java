package Chapter7;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayTest {

    @Test
    public void testReverseArray() {
        int[] inputArray = {10, 20, 30, 40, 50};
        int[] result = ReverseArray1.reverseArrayElements(inputArray);
        int[] expectedResult = {50, 40, 30, 20, 10};
        assertArrayEquals(expectedResult, result);
    }
}
