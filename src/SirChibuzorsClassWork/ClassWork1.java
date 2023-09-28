package SirChibuzorsClassWork;

import java.util.Scanner;

public class ClassWork1 {
          public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Range of Numbers:");
            int range = input.nextInt();

            int sum = 0;

            for (int count = 1; count <= range; count++) {
                System.out.print("Enter Score " + count + ": ");
                int scores = input.nextInt();


                sum = sum + scores;

            }
            System.out.println("The Sum of Scores is: " + sum );

        }
    }

