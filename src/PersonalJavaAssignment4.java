import java.util.Scanner;

public class PersonalJavaAssignment4 {
    public static void main(String[] args) {
        //Factorial: Write a Java program that calculates and prints the factorial of a given number.
        // The user should input the number, and your program should use a for loop to compute the factorial.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = input.nextInt();
        int count = 1;
        int result = 1;
        for (count = 1; count <= number; count++) {
            result = result * count;
        }
        System.out.println(result);
    }
}
