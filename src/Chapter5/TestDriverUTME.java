package Chapter5;

import java.util.Scanner;

public class TestDriverUTME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Copies: ");
        int copies = input.nextInt();

        int totalPrice = calculateTotalPrice(copies);

        System.out.println("Total Price: " + totalPrice);
    }

    public static int calculateTotalPrice(int copies) {
        int pricePerCopy;

        if (copies <= 4) {
            pricePerCopy = 2000;
        } else if (copies <= 9) {
            pricePerCopy = 1800;
        } else if (copies <= 29) {
            pricePerCopy = 1600;
        } else if (copies <= 49) {
            pricePerCopy = 1500;
        } else if (copies <= 99) {
            pricePerCopy = 1300;
        } else if (copies <= 199) {
            pricePerCopy = 1200;
        } else if (copies <= 499) {
            pricePerCopy = 1100;
        } else {
            pricePerCopy = 1000;
        }

        return copies * pricePerCopy;
    }
}
