package Chapter7;

import java.util.Arrays;

public class ArraysSnacks2 {
    public static int[] reverseList(int[] arr) {
        int length = arr.length;
        int[] reversedList = new int[length];
        for (int i = 0; i < length; i++) {
            reversedList[i] = arr[length - 1 - i];
        }
        return reversedList;
    }

    public static void main(String[] args) {

        int [] myList = {1, 2, 3, 4, 5};
        int [] result = reverseList(myList);
        System.out.println(Arrays.toString(result));

        }

    }
