package Chapter7;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysSnacks1Test {
    @Test
    public void testFindLargestElement() {
        ArraysSnacks1 arraysSnacks1 = new ArraysSnacks1();
        int result = arraysSnacks1.findLargestElement(new int[]{4, 6, 8, 2, 5});
        assertEquals(8, result);
    }
}
