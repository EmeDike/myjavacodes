package Chapter6;

public class ClassWorkPalindrome {
    public int sum(int number) {
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        for (int count = 1; count <= number; count++) {
            firstNumber = number / 100;
            secondNumber = number / 10 % 10;
            thirdNumber = number % 10;
        }
        return firstNumber + secondNumber + thirdNumber;


    }

    public int sumOfAnyDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}