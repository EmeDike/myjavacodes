package Chapter7;

import java.util.Arrays;

public class ArraysSnacks4 {
    public static int[] oddPositionElements(int[] arr) {
        int length = arr.length / 2;
        int oddsIndex = 0;
        int[] oddPosition = new int[length];
        for (int i = 1; i <= arr.length; i += 2) {
            oddPosition[oddsIndex] = arr[i];
            oddsIndex ++;
        }
        return oddPosition;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = oddPositionElements(array);
        System.out.println(Arrays.toString(result));
    }
}