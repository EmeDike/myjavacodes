package Chapter5;
import java.util.Scanner;

public class BackToSenderLogistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter count of Successful Delivery: ");
        int successfulDelivery = input.nextInt();

        int wage = calculateWage(successfulDelivery);

        System.out.println("Wage: " + wage);
    }

    public static int calculateWage(int successfulDelivery) {
        int deliveryRate;
        int baseSalary;

        if (successfulDelivery <= 50) {
            deliveryRate = 160;
            baseSalary = 5000;
        } else if (successfulDelivery <= 59) {
            deliveryRate = 200;
            baseSalary = 5000;
        } else if (successfulDelivery <= 69) {
            deliveryRate = 250;
            baseSalary = 5000;
        } else {
            deliveryRate = 500;
            baseSalary = 5000;
        }

        int wage = successfulDelivery * deliveryRate + baseSalary;
        return wage;
    }
}
