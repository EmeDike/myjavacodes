package Chapter5;

import java.util.Scanner;

public class Assignmentfunctions2 {
    public static void main(String[] args) {
        //Write a function that takes an integer and returns true if the number is
        //a prime number and returns false if it is not a prime number

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();

        boolean isPrime = primeState(number);
        System.out.println(isPrime);
    }

    public static boolean primeState(int number) {

        for (int count = 2; count <= number; count++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < count; divisor++) {
                if (count % divisor == 0) {
                    isPrime = false;
                    break;
                }
                if (isPrime) {
                    return true;
                } else
                    return false;
            }
        }
        return false;
    }
}