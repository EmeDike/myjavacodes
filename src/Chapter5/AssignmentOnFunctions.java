package Chapter5;

import java.util.Scanner;

public class AssignmentOnFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        int factorial = factorialResult(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int factorialResult(int number) {
        int factorial = 1;
        for (int count = 1; count <= number; count++) {
            factorial *= count;
        }
        return factorial;
    }
}
