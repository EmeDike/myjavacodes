package SirChibuzorsClassWork;

import java.util.Scanner;

public class ClassWork8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = 10;
        int SumOfValidScores = 0;

        for (int count = 1; count <= range; count++) {
            System.out.print("Enter Valid Score from 1  to 100: ");
            int scores = input.nextInt();


            if (scores >= 1 && scores <= 100) {
                SumOfValidScores = SumOfValidScores + scores;
            } else {
                System.out.println("Number is not a valid number");
            }

        }
        System.out.println("The Sum of Valid Scores = " + SumOfValidScores);
    }
}
