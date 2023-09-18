package Chapter5;

import java.util.Scanner;

public class AssignmentFunctions3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        int difference = positiveDifference(firstNumber, secondNumber);

        System.out.println("Difference between the two integers is: " + difference);
    }

    public static int positiveDifference(int firstNumber, int secondNumber) {
        int difference;

        if (firstNumber >= secondNumber) {
            difference = firstNumber - secondNumber;
        } else {
            difference = secondNumber - firstNumber;
        }

        return difference;
    }
}
