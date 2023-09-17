package Chapter5;

import org.w3c.dom.ls.LSOutput;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        //Write a Java program that checks if a given number is prime.
        // Use a for loop and an if statement to determine if the number has any divisors other than 1 and itself.

        int number = 100;
        int count = 2;
        boolean isPrime = true;

        for (count = 2; count <= number; count++) {
            isPrime = true;

        for (int divisor = 2; divisor <= count; divisor++) {
            if (count % divisor == 0) {
                isPrime = false;
            }
            }

        if (isPrime == true) {
            System.out.println("Number is a prime number");
        } else {
            System.out.println("Number is not a prime number");
        }
    }
    }
}