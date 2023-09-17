package Chapter5;

import java.util.Scanner;

public class PositiveNegativeAndZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Range");
        int range = input.nextInt();
        int totalPositive = 0;
        int totalNegative = 0;
        int totalZero = 0;

        int count = 1;
        for (count = 1; count <= range; count++) {
            System.out.println("Enter Number " + count);
            int number = input.nextInt();

            if (number > 0) {
                totalPositive++;

            } else if (number < 0) {
                totalNegative++;
            } else if (number == 0){
                totalZero++;
            }
        }
        System.out.println("Total number of positive numbers are " + totalPositive);
        System.out.println("Total number of negative numbers are " + totalNegative);
        System.out.println("Total number of zero numbers are " + totalZero);



    }
}