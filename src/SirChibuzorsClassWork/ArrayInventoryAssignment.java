package SirChibuzorsClassWork;
import java.util.Scanner;

public class ArrayInventoryAssignment {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                int numCustomers = 3;
                int numItems = 3;

                double[][] prices = new double[numItems][numCustomers];

                for (int customer = 0; customer < numCustomers; customer++) {
                    for (int item = 0; item < numItems; item++) {

                        System.out.print("Enter price for Customer " + (customer + 1) + ", Item " + (item + 1) + ": ");
                        double price = scanner.nextDouble();

                        prices[item][customer] = price;
                    }
                }

                System.out.println("\nTabular Form:");
                System.out.print("Items  |");
                for (int customer = 1; customer <= numCustomers; customer++) {
                    System.out.print(" Customer " + customer + " |");
                }
                System.out.println("\n-------------------------------------------");
                for (int item = 0; item < numItems; item++) {
                    System.out.print("Item " + (item + 1) + " | ");
                    for (int customer = 0; customer < numCustomers; customer++) {
                        System.out.printf("$%.2f    | ", prices[item][customer]);
                    }
                    System.out.println();
                }

                // Close the scanner
                scanner.close();
            }
        }

