package Chapter7;

import java.util.Scanner;

public class CreditCardValidator {

    public static String validateCreditCard(String cardNumber){

        if (cardNumber.length() < 13 || cardNumber.length() > 16) {
            return "Invalid Card Length";
        }

        String cardType = identifyCardType(cardNumber);
        int totalSum = calculateTotalSum(cardNumber);
        boolean isValid = totalSum % 10 == 0;

        return cardType + "\ncredit card number: " + cardNumber +
                "\ncredit card digit length: " + cardNumber.length() +
                "\ncredit card validity status: " + (isValid ? "valid" : "invalid");
    }

    private static String identifyCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "credit card type: Visa";
        } else if (cardNumber.startsWith("5")) {
            return "credit card type: MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "credit card type: American Express";
        } else if (cardNumber.startsWith("6")) {
            return "credit card type: Discover";
        } else {
            return "credit card type: Unknown Card Type";
        }
    }

    private static int calculateTotalSum(String cardNumber) {
        int totalSum = 0;
        char[] reverseDigits = new StringBuilder(cardNumber).reverse().toString().toCharArray();

        for (int i = 0; i < reverseDigits.length; i++) {
            int digit = Character.getNumericValue(reverseDigits[i]);
            if (i % 2 == 1) {
                int doubledDigit = digit * 2;
                totalSum += doubledDigit < 10 ? doubledDigit : (doubledDigit - 9);
            } else {
                totalSum += digit;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kindly Enter Card Details To Verify: ");
        String creditCardNumber = scanner.nextLine();
        scanner.close();

        String result = validateCreditCard(creditCardNumber);
        System.out.println("\nResult:\n" + result);
    }
}
