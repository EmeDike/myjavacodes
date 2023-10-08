package Chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArraysSnacks4Test {
        @Test
        public void testOddPositionElements() {
            // Regular Case
            assertArrayEquals(new int[]{1, 3, 5}, ArraysSnacks4.oddPositionElements(new int[]{1, 2, 3, 4, 5}));


        }
    }

