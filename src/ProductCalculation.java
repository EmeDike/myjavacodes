// ProductServer.java

public class ProductCalculation {

    public static int multiply(int firstNumber, int secondNumber) {
        int result = 0;

        for (int count = 0; count < secondNumber; count++) {
            result += firstNumber;
        }

        return result;
    }
}