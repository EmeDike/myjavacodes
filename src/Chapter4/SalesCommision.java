package Chapter4;

import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int salary = 200;
        int count = 1;
        int totalSales = 0;

        for (; ;) {
            System.out.println("Enter weekly total sales");
            int sales = input.nextInt();

            totalSales = totalSales + sales;

            count++;

            if (sales == 0) {
                break;
            }

        }
            int totalEarnings = (int) (0.9 * totalSales + salary);
        System.out.println("Total Earnings is: " + totalEarnings);

        }
    }
