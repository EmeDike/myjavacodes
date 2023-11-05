package SirChibuzorsClassWork;

import java.util.Scanner;

public class ArrayInventory {
    public static void main(String[] args) {

        int numCustomers = 3;
        int numItems = 3;

        double[][] prices = new double[numItems][numCustomers];

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= numCustomers; customer++) {
            for (int item = 1; item <= numItems; item++) {
                System.out.print("Enter price for customer " + customer + ", item " + item + ": ");
                prices[item - 1][customer - 1] = input.nextDouble();
            }
        }

        System.out.print("Items  |");
        for (int i = 1; i <= numCustomers; i++) {
            System.out.print(" Customer " + i + " |");
        }
        System.out.println("\n-------------------------------------------");

        for (int item = 1; item <= numItems; item++) {
            System.out.print("Item " + item + " | ");
            for (int customer = 1; customer <= numCustomers; customer++) {
                System.out.printf("$%.2f    | ", prices[item - 1][customer - 1]);
            }
            System.out.println();
        }
    }
}
