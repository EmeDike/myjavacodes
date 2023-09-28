package SirChibuzorsClassWork;

import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Range of Numbers:");
        int range = input.nextInt();

        int average = 0;
        int sum = 0;

        for (int count = 1; count <= range; count++) {
            System.out.print("Enter Score " + count + ": ");
            int scores = input.nextInt();

            sum = sum + scores;


            average = sum / range;

        }
        System.out.println("The Average of Scores is: " + average );

    }

}
