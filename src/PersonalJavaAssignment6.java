import java.util.Scanner;

public class PersonalJavaAssignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Range of Numbers:");
        int range = input.nextInt();
        int maximumNumber = 1;

            for (int count = 1; count <= range; count++) {
                System.out.print("Enter number " + count + ": ");
                int userInput = input.nextInt();

                if (userInput > maximumNumber) {
                    maximumNumber = userInput;
                }
            }
        System.out.println("The maximum number is: " + maximumNumber);

    }
}
