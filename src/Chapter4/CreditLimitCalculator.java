package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        int count = 1;
        int range;
        int totalCharges;
        int totalCredits;
        int creditLimit;
        String accountNumber = " ";
        int initialBalance;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Range");
        range = scanner.nextInt();


        for (count = 1; count <= range; count++){
            System.out.println("Enter Account Number");
            accountNumber = scanner.nextLine();
            scanner.nextLine();


            System.out.println("Enter Initial Balance");
            initialBalance = scanner.nextInt();

            System.out.println("Enter Credit Limit");
            creditLimit = scanner.nextInt();

            System.out.println("Enter Total Charges");
            totalCharges = scanner.nextInt();

            System.out.println("Enter Total Credit");
            totalCredits = scanner.nextInt();

            double newBalance = initialBalance + totalCharges - totalCredits;

            if (newBalance > creditLimit){
                System.out.println("CREDIT LIMIT EXCEEDED");
            }
            else{
                System.out.println("TRANSACTION IN PROGRESS");
            }


        }
    }
}
