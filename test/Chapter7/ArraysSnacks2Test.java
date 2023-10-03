package Chapter7;

import org.junit.Test;

import static SirChibuzorsClassWork.IndependenceArrayAssignment2.reverseList;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysSnacks2Test {
    @Test
    public void testReverseList() {
        ArraysSnacks2 arraysSnacks2 = new ArraysSnacks2();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reverseList(new int[]{1, 2, 3, 4, 5}));

    }

}