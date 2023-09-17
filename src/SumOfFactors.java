import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter An Integer");
        int number = input.nextInt();
        int totalSum = 0;

        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                totalSum += factor;
            }
        }
        System.out.println("Sum of factors: " + totalSum);
    }
}
