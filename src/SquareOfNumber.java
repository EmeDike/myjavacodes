import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int number = input.nextInt();

        int squareOfNumber = number * number;
        System.out.println(" The Square of " + " " +  number + " is " + " " + squareOfNumber);


    }
}
