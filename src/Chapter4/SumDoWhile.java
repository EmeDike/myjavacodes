package Chapter4;
import java.util.Objects;
import java.util.Scanner;

public class SumDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;

        do {
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter 'Quit' to quit: ");
            String userInput = scanner.nextLine();

            sum = firstNumber + secondNumber;

            if (Objects.equals(userInput, "quit")) {
                break;
            } else {
                System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
            }

        } while (true);
    }
}
