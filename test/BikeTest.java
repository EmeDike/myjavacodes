import java.util.Scanner;

//import static sun.security.ssl.SSLLogger.isOn;

public class BikeTest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Bike Name: ");
            String bikeName = input.nextLine();

            Bike bike = new Bike(bikeName, false);

            System.out.println("Bike name: " + bike.getName());
            System.out.println("Is bike on? " + bike.isOn());

            System.out.print("Turn on the bike; true/false?: ");
            boolean turnOn = input.nextBoolean();
            bike.setOn(turnOn);

            System.out.println("Is bike on? " + bike.isOn());
        }
    }

