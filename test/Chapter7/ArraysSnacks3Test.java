package Chapter7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysSnacks3Test {
    @Test
    public void testElementInList() {
        ArraysSnacks3 arraysSnacks3 = new ArraysSnacks3();
        boolean result = arraysSnacks3.checkElement(new int[]{1, 2, 3, 4, 5});
        assertTrue(true, String.valueOf(result));

    }
    }

}