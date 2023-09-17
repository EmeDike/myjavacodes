package Chapter5;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Range ");
        int range = input.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        int sum = 0;
        for (int count = 1; count <= range; count++) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Number is Even Number ");
               evenSum = evenSum + number;

            } else {
                System.out.println("Number is Odd ");
                oddSum = oddSum + number;

            }
        }
        System.out.println("Sum of Even Number is: " + evenSum);
        System.out.println("Sum of Odd Number is: " + oddSum);
    }

}
