package Chapter7;

public class ArraysSnacks1 {
    public static int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int number : arr){
            if (number > max){
                max = number;
            }
        }
        return max;



    }
}
