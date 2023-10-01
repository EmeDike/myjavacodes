package SirChibuzorsClassWork;

public class IndependenceArrayAssignment2 {
    public static int[] reverseList(int[] arr) {
        int length = arr.length;
        int[] reversedList = new int[length];
        for (int i = 0; i < length; i++) {
            reversedList[i] = arr[length - 1 - i];
        }
        return reversedList;
    }
}
