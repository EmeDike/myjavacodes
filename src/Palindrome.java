import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a three digit number");
        int number = input.nextInt();
        boolean isPalindrome = true;

        int firstNumber = number / 100;
        int secondNumber = number / 10 % 10;
        int thirdNumber = number % 10;

        for (firstNumber = 0; firstNumber == thirdNumber; firstNumber++){
            if (firstNumber == thirdNumber){
                isPalindrome = true;
            }
        }
        if (isPalindrome = true){
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }
    }
}
