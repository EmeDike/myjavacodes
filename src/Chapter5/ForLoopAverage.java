package Chapter5;

import java.util.Scanner;

public class ForLoopAverage {
    public static void main(String[] args) {
        //Write a Java program to calculate and print the average
        // of a series of integers entered by the user. Use a for loop to input the values.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Range of Numbers:");
        int range = input.nextInt();
        double average = 0;
        int sum = 0;

        for (int count = 1; count <= range; count++) {
            System.out.print("Enter number " + count + ": ");
            int userInput = input.nextInt();
            sum = sum + userInput;
        }
        average = sum / range;
        System.out.println(average);
    }
}
