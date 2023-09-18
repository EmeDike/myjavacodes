package Chapter5;

import java.util.Scanner;

public class AssignmentFunctions4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();

        boolean isSquareRoot = squaredNumber(number);
        System.out.println(isSquareRoot);
    }

    public static boolean squaredNumber(int number) {
        double squareRoot = Math.sqrt(number);

        if (squareRoot == (int) squareRoot) {
            return true;
        } else {
            return false;
        }
    }
}
