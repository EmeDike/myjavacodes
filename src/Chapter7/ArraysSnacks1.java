package Chapter7;

public class ArraysSnacks1 {
    public static int findLargestElement(int[] arr) {
        int largestNumber = arr[0];
        for (int number : arr) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 5, 3, 9, 2}; // Replace this with your actual array
        int result = findLargestElement(myArray);
        System.out.println(result);
    }
}
