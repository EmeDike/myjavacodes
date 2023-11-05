package SirChibuzorsClassWork;

import java.util.Scanner;

public class PizzaRecommendationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of super-hungry, hungry, and classic people: ");
        int superhungry = scanner.nextInt();
        int hungry = scanner.nextInt();
        int classic = scanner.nextInt();

        int smallSlices = 4;
        int mediumSlices = 6;
        int largeSlices = 10;

        int totalSlices = superhungry * smallSlices + hungry * mediumSlices + classic * largeSlices;

        int requiredSmallBoxes = (totalSlices + smallSlices - 1) / smallSlices;
        int requiredMediumBoxes = (totalSlices + mediumSlices - 1) / mediumSlices;
        int requiredLargeBoxes = (totalSlices + largeSlices - 1) / largeSlices; 

        double costPerSmallBox = 8.0;
        double costPerMediumBox = 12.0;
        double costPerLargeBox = 18.0;

        double totalAmountSpent = requiredSmallBoxes * costPerSmallBox
                + requiredMediumBoxes * costPerMediumBox
                + requiredLargeBoxes * costPerLargeBox;

        int smallLeftover = requiredSmallBoxes - superhungry;
        int mediumLeftover = requiredMediumBoxes - hungry;
        int largeLeftover = requiredLargeBoxes - classic;

        System.out.println("You need the following number of pizza boxes:");
        System.out.println("Small: " + requiredSmallBoxes);
        System.out.println("Medium: " + requiredMediumBoxes);
        System.out.println("Large: " + requiredLargeBoxes);
        System.out.println("Total amount spent: $" + totalAmountSpent);
        System.out.println("Number of leftover pizza boxes:");
        System.out.println("Small: " + smallLeftover);
        System.out.println("Medium: " + mediumLeftover);
        System.out.println("Large: " + largeLeftover);
    }
}
