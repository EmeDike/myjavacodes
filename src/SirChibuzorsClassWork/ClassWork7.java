package SirChibuzorsClassWork;

import java.util.Scanner;

public class ClassWork7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range=0;
        int SumOfValidScores = 0;

        for (int count = 1; count <= range; count++) {
            System.out.print("Enter Valid Score from 1  to 100: ");
            int scores = input.nextInt();


            if (scores >= 1 && scores <= 100) {
                int validScore =

                SumOfValidScores = SumOfValidScores + scores;
            } else {
                System.out.println("Number is not a valid number");

            }




        }
        System.out.println("The Sum of Valid Scores = " + SumOfValidScores);
    }
}