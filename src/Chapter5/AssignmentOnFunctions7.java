package Chapter5;

import java.util.Scanner;

public class AssignmentOnFunctions7 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();

        boolean isPalindrome = palindromeCheck(number);

        System.out.println("Is this number a palindrome? " + isPalindrome);
    }

    public static boolean palindromeCheck(int number) {
        int firstNumber = number / 10000;
        int secondNumber = number / 1000 % 10;
        int fourthNumber = number / 10 % 10;
        int fifthNumber = number % 10;

        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            return true;
        } else {
            return false;
        }
    }
}
