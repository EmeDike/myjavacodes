package SirChibuzorsClassWork;

public class IndependenceArrayAssignment6 {
    public static int [] runningTotal(int [] arr) {
        int length = arr.length;
        int []result = new int[length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            result[i] = sum;
        }
        return result;


    }
}
