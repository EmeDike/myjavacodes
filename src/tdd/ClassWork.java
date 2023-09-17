package tdd;

public class ClassWork {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int fourthNumber = firstNumber;

        firstNumber = secondNumber;
        System.out.println("first number is " + secondNumber);
        secondNumber = thirdNumber;
        System.out.println("Second number is " + thirdNumber);
        thirdNumber = fourthNumber;
        System.out.println("thirdNumber is " + fourthNumber);
    }
}
