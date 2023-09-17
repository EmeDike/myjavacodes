

public class PrimeNumbers {
    public static void main(String[] args) {
        // Write a Java program that checks if a given number is prime.
        // Use a for loop and an if statement to determine if the number has any divisors other than 1 and itself.

        int number = 100;

        for (int count = 2; count <= number; count++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < count; divisor++) {
                if (count % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(count + " is a prime number");
            }
        }

    }
}

