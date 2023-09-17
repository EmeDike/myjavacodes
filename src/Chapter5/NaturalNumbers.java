package Chapter5;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        boolean isNatural = true;
        int range = 10;
        int sum = 0;
        int count;
        Scanner dike = new Scanner(System.in);
        int digit = 0;
        for (count = 1; count <= range; count++) {   //keep reading user input till range
            System.out.println("ENTER A NUMBER");
            digit = dike.nextInt();
            if (digit <= 0) {                   //checks for number < 0
                isNatural = false;

                System.out.println("number is not natural number");
            } else if (isNatural = true) {
                System.out.println("number is natural");
                sum = sum + digit;
            }
        }

        System.out.println("sum is equal to " + sum);
    }
}

