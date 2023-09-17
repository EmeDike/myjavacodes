package Chapter5;

import java.util.Scanner;

public class RepeatSumOperationForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int count = 1; ; count++) {
            System.out.println("Enter firstNumber");
            int firstNumber = input.nextInt();
            System.out.println("Enter secondNumber");
            int secondNumber = input.nextInt();

            System.out.println("Iteration " + count);

            int sum = firstNumber + secondNumber;
            System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

            System.out.println("Do you want the action to be repeated?");
            System.out.println("Enter YES or NO: ");

            // Read the user's response as a string
            String reply = input.next();

            if (reply.equalsIgnoreCase("NO")) {
                break;
            } else if (!reply.equalsIgnoreCase("YES")) {
                // Handle invalid input here, if needed
                System.out.println("Invalid input. Please enter YES or NO.");
            }
        }
    }
}
