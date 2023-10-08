import java.util.Arrays;

public class ArraySortNumbers {

    public static int[][] findValues(Object[] tuple, int value1, int value2) {
        int[][] positions = new int[tuple.length - 1][];

        for (int i = 1; i < tuple.length; i++) {
            if (tuple[i] instanceof int[]) {
                int[] innerArray = (int[]) tuple[i];
                int[] foundPositions = Arrays.stream(innerArray)
                        .filter(j -> j == value1 || j == value2)
                        .toArray();
                positions[i - 1] = foundPositions;
            }
        }

        return positions;
    }
}
