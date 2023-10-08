package Chapter7;

public class ReverseArray1 {
    public static int[] reverseArrayElements(int[] inputArray) {
            int[] reversedArray = new int[inputArray.length];

            int i;
            for (i = 0; i < inputArray.length; i++) {
                reversedArray [i] = inputArray[inputArray.length - i - 1];
            }

            return reversedArray ;
        }



}


