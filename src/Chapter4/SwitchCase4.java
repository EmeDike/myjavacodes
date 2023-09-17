package Chapter4;
import java.util.Scanner;
public class SwitchCase4 {
    public static void main(String[] args) {
        //Simulate a traffic light with options for "Red," "Yellow," and "Green."
        // Use a switch statement to display the action a driver should take based on the selected light.
        Scanner input = new Scanner(System.in);
        System.out.println("Entere desired number");
        int number = input.nextInt();
        String action = null;
        String colour = null;


        switch (number) {
            case 1:
                colour = "RED";
                action = "STOP";
                break;

            case 2:
                colour = "YELLOW";
                action = "READY";
                break;

            case 3:
                colour = "GREEN";
                action = "GO";
                break;

            default:
                System.out.println("INVALID INPUT");
        }
                System.out.println("Selected colour is " + colour);
        System.out.println(colour + " means " + action);

        }
    }
