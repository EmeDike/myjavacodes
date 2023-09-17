package Chapter4;

import java.util.Scanner;

public class SentinelCounter {
    // Drivers are concerned with the mileage their automobiles get. One driver has
    //kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
    //a Java application that will input the miles driven and gallons used (both as integers) for each trip.
    // The program should calculate and display the miles per gallon obtained for each trip and print the
    //combined miles per gallon obtained for all trips up to this point. All averaging calculations should
    //produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
    //from the user.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int range = 100;
        double totalMPG = 0;


        System.out.println("Enter Range");
        range = input.nextInt();

        for (count = 1; count <= range; count++) {

            System.out.println("Enter Miles Driven");
            int miles = input.nextInt();
            System.out.println("Enter Gallons Used");
            int gallons = input.nextInt();

            double milesPerGallon = miles / gallons;
            totalMPG = totalMPG + milesPerGallon;

            if (miles == -1) {
                System.out.println("Invalid Number Of Miles");
                break;
            }
        }
        System.out.println(" TotalMPG is: " + totalMPG);
    }
}



