import java.util.Scanner;

public class PersonalJavaAssignment {
    public static void main(String[] args) {
        //Write a Java program that prints all even numbers from 1 to 20 using a for loop and an if statement.
        int number = 20;
        int count = 1;

        for (; count <= number; ) {

                if (count % 2 == 0) {
                    int even = count;

                    System.out.println(even);
                }
            count++;

        }
    }
}