package Chapter5;

import java.util.Scanner;

public class AssignmentOnFunctions6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        int result = (int) calculateQuotient(firstNumber, secondNumber);
        System.out.println("Quotient is: " + result);
    }
    public static double calculateQuotient(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0;
        } else {
            double quotient = (double) firstNumber / secondNumber;
            return Math.round(quotient * 100.0) / 100.0;
        }
    }
}
