package Chapter5;

public class AssignmentOnFunctions8 {

    public static void main(String[] args) {

        int number = 10;
        int result = countFactors(number);
        System.out.println("The number of factors for " + number + " is " + result);
    }

    public static int countFactors(int number) {
        int factorsCount = 0;

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                factorsCount++;
            }
        }

        return factorsCount;
    }
}
