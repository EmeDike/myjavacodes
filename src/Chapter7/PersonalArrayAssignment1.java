package Chapter7;

public class PersonalArrayAssignment1 {
    public static int sumArrayElements(int[] newArray) {
        int sum = 0;
        for (int index = 0; index < newArray.length; index++) {
            sum = sum + newArray[index];
        }
        return sum;
    }
    public static int evenPosition(int[] newArray) {
        int evenNumberPositions = 0;
        for (int index = 0; index < newArray.length; index += 2){
            evenNumberPositions += newArray[index];
        }
    return evenNumberPositions;
    }
    public static int oddPosition(int[] newArray) {
        int oddNumberPositions = 0;
        for (int index = 1; index < newArray.length; index += 2){
            oddNumberPositions += newArray[index];
        }
        return oddNumberPositions;
    }

    public static int addEvenNumbers(int[] newArray) {
        int evenSum = 0;
        for (int index = 0; index < newArray.length; index++) {
            if (newArray[index] % 2 == 0){
            evenSum += newArray[index];
        }

    }
        return evenSum;
    }

    public static int addOddNumbers(int[] newArray) {
        int oddSum = 0;
        for (int index = 0; index < newArray.length; index++) {
            if (newArray[index] % 2 == 1) {
                oddSum += newArray[index];
            }

        }
        return oddSum;
    }
}
