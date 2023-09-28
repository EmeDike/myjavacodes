package SirChibuzorsClassWork;

import java.util.Scanner;

public class ArrayAssignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        double totalScore = 0;
        for (int i = 0; i < 10; i++) {
            totalScore += scores[i];
        }

        System.out.println("Total Score is " + totalScore);

        double average = 0;
        for (int i = 0; i < 10; i++) {
            average = totalScore / 10;
        }
        System.out.println("Average of Scores is " + average);

        double minimum =  scores[0];
        for (int i = 0; i < 10; i++) {
            if (scores[i] < minimum) {
                minimum = scores[i];
            }
        }
        System.out.println("Minimum Scores is " + minimum);

        double maximum = scores[0];
        for (int i = 0; i < 10; i++) {
            if (scores[i] > maximum) {
                maximum = scores[i];
            }
        }
        System.out.println("Maximum Scores is " + maximum);
    }
}
