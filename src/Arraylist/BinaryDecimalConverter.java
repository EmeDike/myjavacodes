package Arraylist;

public class BinaryDecimalConverter {

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            char bit = binary.charAt(i);

            if (bit == '1') {
                decimal += (int) Math.pow(2, binaryLength - 1 - i);
            }
        }

        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        String binaryNumber = "1000";
        int decimalResult = binaryToDecimal(binaryNumber);
        System.out.println("Decimal representation of " + binaryNumber + " is: " + decimalResult);

        int decimalNumber = 10;
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryResult);
    }
}
