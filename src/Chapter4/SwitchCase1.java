import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int number = input.nextInt();
        String menuOption;

        switch (number) {
            case 1:
                menuOption = "Addition";
                break;
            case 2:
                menuOption = "Subtraction";
                break;
            case 3:
                menuOption = "Multiplication";
                break;
            case 4:
                menuOption = "Division";
                break;
            default:
                menuOption = "Invalid Number";
        }

        System.out.println("Selected operation: " + menuOption);
    }
}
