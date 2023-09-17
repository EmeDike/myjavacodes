public class PersonalJavaAssignment2 {
    public static void main(String[] args) {
        //Write a Java program to find and print the prime numbers between 1 and 50 using a for loop and an if statement.
        int number = 50;
        int divisor = 2;

        for (int count = 2; count < number; count++) {
            boolean isPrime = true;
            for (divisor = 2; divisor < count; divisor++)
                if (count % divisor == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime) {
                System.out.println(count);
            }
        }
        }
    }