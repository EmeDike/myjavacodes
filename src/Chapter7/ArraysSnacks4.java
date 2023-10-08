package Chapter7;

public class ArraysSnacks4 {
    public static int[] oddPositionElements(int[] arr) {
        int oddPositionLength = (arr.length + 1)/2;
        int [] result = new int[oddPositionLength];
        for (int i = 0; i < arr.length; i ++) {
            result[i] = arr[i * 2 + 1];
        }
        return result;
    }
}
