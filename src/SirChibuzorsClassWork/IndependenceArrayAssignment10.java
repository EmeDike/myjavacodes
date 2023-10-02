package SirChibuzorsClassWork;

public class IndependenceArrayAssignment10 {
  

    public static int[] combineAlternateElements(int[] arr1, int[] arr2) {
        int length = Math.max(arr1.length, arr2.length) * 2;
        int[] result = new int[length];
        for (int i = 0; i < length; i += 2) {
            if (i < arr1.length) {
                result[i] = arr1[i];
            }
            if (i + 1 < arr2.length) {
                result[i + 1] = arr2[i + 1];
            }
        }
        return result;
    }
}
