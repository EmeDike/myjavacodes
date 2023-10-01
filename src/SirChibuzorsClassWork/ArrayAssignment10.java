package SirChibuzorsClassWork;

public class ArrayAssignment10 {
    public class ArraySumExample {
        public static void main(String[] args) {
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }

            System.out.println("The 3x3 array is:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("The sum of all elements in the array is: " + sum);
        }
    }

}
