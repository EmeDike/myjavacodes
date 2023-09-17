package Chapter5;

import java.util.Scanner;

public class AssignmentOnFunctions1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();

        boolean isEven = displayState(number);
        System.out.println(isEven);
    }

    public static boolean displayState(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
