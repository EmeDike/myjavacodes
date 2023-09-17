package Chapter2;

import java.util.Scanner;

public class AddIntegers {
    public static void main(String[] args) {
        int range = 1000;
        int sum = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = input.nextInt();

        for (int count = 0; count < range; count++) {

            int firstNumber = number / 100;
            int secondNumber = number / 10 % 10;
            int thirdNumber = number % 10;
            sum = firstNumber + secondNumber + thirdNumber;

            }
        System.out.println("Sum of all valid digits: " + sum);
        if (sum <= 1000 ){
            System.out.println("Completed");
        }





    }
}
