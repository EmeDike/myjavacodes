package Chapter4;
import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        //Design a simple text-based game with options like "Start Game," "Load Game," "Settings," and "Exit."
        // Use a switch statement to handle the user's choice.

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        String selectedOption = " ";


        switch (number) {

            case 1:
                selectedOption = "Start Game";
                break;

            case 2:
                selectedOption = "Load Game";
                break;

            case 3:
                selectedOption = "Settings";
                break;

            case 4:
                selectedOption = "Exit";
                break;


                default:
                System.out.println("Invalid Input");
        }
                System.out.println("Selected Operation is " + selectedOption);


    }
}
