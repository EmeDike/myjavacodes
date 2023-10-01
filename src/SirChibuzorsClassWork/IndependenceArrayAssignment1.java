package SirChibuzorsClassWork;

public class IndependenceArrayAssignment1 {
    public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }

            }
            return max;
        }
    }
