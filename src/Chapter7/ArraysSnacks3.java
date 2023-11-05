package Chapter7;

public class ArraysSnacks3 {
    public static boolean checkElement(int[] arr, int element) {

        for (int number : arr) {
            if (number == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] array = {2, 3, 4, 8, 9};
        int element = 0;
        boolean result = checkElement(array, element);
        System.out.println(result);

        }

    }
