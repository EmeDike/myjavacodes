package Chapter7;

import static org.junit.jupiter.api.Assertions.*;




import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArraysSnacks4Test {
        @Test
        public void testOddPositionElements() {
            // Regular Case
            assertArrayEquals(new int[]{1, 3, 5}, ArrayUtils.oddPositionElements(new int[]{1, 2, 3, 4, 5}));

            // Edge Cases
            assertArrayEquals(new int[]{}, ArrayUtils.oddPositionElements(new int[]{})); // Empty Array
            assertArrayEquals(new int[]{7}, ArrayUtils.oddPositionElements(new int[]{7})); // Single Element
            assertArrayEquals(new int[]{9}, ArrayUtils.oddPositionElements(new int[]{9, 2})); // Array with One Element
        }
    }


}