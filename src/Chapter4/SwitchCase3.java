package Chapter4;
import java.util.Scanner;
//implement a basic ATM machine program that allows users
// to check their balance, deposit money, or withdraw money.
// Use a switch statement to handle each operation.

public class SwitchCase3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = input.nextInt();
        String selectedOption = " ";

        switch (number){


            case 1:
            selectedOption = "balance";
            break;

            case 2:
                selectedOption = "deposit money";
                break;

            case 3:
                selectedOption = "airtime recharge";
                break;

            case 4:
                selectedOption = "transfer";
                break;

            default:
                System.out.println("Invalid input");
        }
        System.out.println( " Selected input is " + selectedOption);

    }
}
