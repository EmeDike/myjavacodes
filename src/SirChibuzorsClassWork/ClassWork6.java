package SirChibuzorsClassWork;

import java.util.Scanner;

public class ClassWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Range of Numbers: ");
        int range = input.nextInt();

        int evenSum = 0;
        int average = 0;

        for (int count = 1; count <= range; count++) {
            System.out.print("Enter Score " + count + ": ");
            int scores = input.nextInt();

            if (scores % 2 == 0) {
                evenSum = evenSum + scores;
                average = evenSum / range;


            }
        }
        System.out.println("The Average of Even Scores = " + average);

    }
}
