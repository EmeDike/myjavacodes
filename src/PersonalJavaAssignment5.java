import java.util.Scanner;

public class PersonalJavaAssignment5 {
    public static void main(String[] args) {
        //Write a Java program that calculates the sum of all even numbers from 1 to a given number.
        // The user should input the number, and your program should
        // use a for loop and an if statement to add even numbers to the sum.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = input.nextInt();
        int count = 1;
        int sum = 0;

        for (count = 1; count <= number; count++) {
            if (count % 2 == 0){
                sum = sum + count;

            }
        }
        System.out.println(sum);


    }
}