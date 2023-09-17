package Chapter5;
import java.util.Scanner;

public class largestAndSmallestNumbers {
    public static void main(String[] args) {
        int largestNumber = 0;
        int smallestNumber = 0;
        int count = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER RANGE");
        int range = input.nextInt();

        for (count = 1; count <= range; count++) {
            System.out.println("ENTER number");
            int number = input.nextInt();

            if (number > largestNumber) {
                largestNumber = number;

            } else if (smallestNumber <= number) {
                smallestNumber = number;
            }
        }

            System.out.println("LARGEST IS " + largestNumber);
            System.out.println("SMALLEST IS " + smallestNumber);
        }// for loop
        }// for loop

