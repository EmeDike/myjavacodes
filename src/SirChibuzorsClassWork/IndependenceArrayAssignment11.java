package SirChibuzorsClassWork;

public class IndependenceArrayAssignment11 {

    public static int[] numberToDigits(int number) {
        String numberStr = Integer.toString(number);
        int length = numberStr.length();
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return result;
    }
}