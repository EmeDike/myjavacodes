package SirChibuzorsClassWork;
public class IndependenceArrayAssignment5 {
    public static void main(String[] args) {
        int [] array = {1,3,5,6,7,8};
        System.out.println(evenPositions(array));
    }
        public static int[] evenPositions(int[] arr) {
            int evenPositionLength = (arr.length )/2;
            int [] result = new int[evenPositionLength];
            for (int i = 0; i < arr.length; i ++) {
                result[i] = arr[i * 2];
            }
            return result;
        }

    }
