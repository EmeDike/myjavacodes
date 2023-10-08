import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraySortNumbersTest {

    @Test
    void testFindValues() {
        Object[] tuple2 = {"Orange", new int[]{10, 20, 30}, new int[]{5, 15, 25}};

        int[][] result = ArraySortNumbers.findValues(tuple2, 20, 25);

        int[][] expected = {{20}, {25}};

        assertArrayEquals(expected, result);
    }
}
