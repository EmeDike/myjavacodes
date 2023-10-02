package SirChibuzorsClassWork;
public class IndependenceArrayAssignment5 {
        public static int[] evenPositions(int[] arr) {
            int evenPositionLength = (arr.length )/2;
            int [] result = new int[evenPositionLength];
            for (int i = 0; i < arr.length; i ++) {
                result[i] = arr[i * 2];
            }
            return result;
        }

    }
