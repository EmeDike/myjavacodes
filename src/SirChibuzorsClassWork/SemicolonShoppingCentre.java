package SirChibuzorsClassWork;

import java.util.ArrayList;
import java.util.Scanner;

public class SemicolonShoppingCentre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the customer's name: ");
        String customerName = input.nextLine();

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Integer> pricePerUnit = new ArrayList<>();

        String numberOfTimes = "YES";
        int count = 0;

        while (numberOfTimes.equals("YES")) {
            System.out.println("What did the user purchase: ");
            String userPurchase = input.next();
            items.add(userPurchase);

            System.out.println("How many pieces: ");
            int itemQuantity = input.nextInt();
            quantity.add(itemQuantity);

            System.out.println("How much per unit: ");
            int unitPrice = input.nextInt();
            pricePerUnit.add(unitPrice);

            count++;

            System.out.println("Continue Shopping? (YES/NO): ");
            numberOfTimes = input.next().toUpperCase();
        }

        System.out.println("Enter your name? ");
        String cashierName = input.next();
        System.out.println("How much is the discount: ");
        int discount = input.nextInt();

        System.out.println("""
                            SEMICOLON STORES
                            MAIN BRANCH
                            LOCATION
                            TELEPHONE
                            DATE CASHIER'S NAME
                            CUSTOMER'S NAME
                            ===============================================================
                                            ITEM        QUANTITY       PRICE      TOTAL
                            ---------------------------------------------------------------
                """);

        double subTotal = 0;

        for (int i = 0; i < count; i++) {
            int total = quantity.get(i) * pricePerUnit.get(i);
            subTotal += total;
            System.out.printf("""
                                   %s            %d             %d             %d
                    """, items.get(i), quantity.get(i), pricePerUnit.get(i), total);
        }

        double discountRate = (subTotal * discount) / 100;
        double vat = (subTotal * 17.50) / 100;
        double billTotal = subTotal + vat - discountRate;

        System.out.printf("""
                                
                                SUBTOTAL: %.2f
                                DISCOUNT: %.2f
                                VAT: %.2f
                                =============================================
                                BILL TOTAL: %.2f
                                =============================================
                                THIS IS NOT A RECEIPT. KINDLY PAY %.2f
                """, subTotal, discountRate, vat, billTotal, billTotal);
        System.out.println("");
    }
}
