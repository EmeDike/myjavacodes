package SirChibuzorsClassWork;

public class IndependenceArrayAssignment7 {
    public static int sumWithForLoop(int[] arr) {
        int total = 0;
        for (int number : arr) {
            total += number;
        }
        return total;
    }

    public static int sumWithWhileLoop(int[] arr) {
        int total = 0;
        int i = 0;
        while (i < arr.length) {
            total += arr[i];
            i++;
        }
        return total;
    }

    public static int sumWithDoWhileLoop(int[] arr) {
        int total = 0;
        int i = 0;
        do {
            total += arr[i];
            i++;
        } while (i < arr.length);
        return total;
    }
}
