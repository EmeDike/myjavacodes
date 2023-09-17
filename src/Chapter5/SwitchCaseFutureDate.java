package Chapter5;

import java.util.Scanner;

public class SwitchCaseFutureDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter todays date ");
        int date = input.nextInt();
        System.out.println("Enter the number of days elapsed since today");
        int days = input.nextInt();
        int future = (days % 7) + date;

        switch (date) {
            case 0:
                System.out.println("today is sunday");
                break;
            case 1:
                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
        }
        switch (future) {
            case 0:
                System.out.println("and the future is sunday");
                break;
            case 1:
                System.out.println("and the future is monday");
                break;
            case 2:
                System.out.println("and the future  is tuesday");
                break;
            case 3:
                System.out.println("and the future  is wednesday");
                break;
            case 4:
                System.out.println("and the future  is thursday");
                break;
            case 5:
                System.out.println("and the future  is friday");
                break;
            case 6:
                System.out.println("and the future  is saturday");
                break;
        }
    }
}