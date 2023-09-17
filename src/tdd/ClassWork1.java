package tdd;

import java.util.Scanner;

public class ClassWork1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number = input.nextInt();
        int count;

        for (; number > 6; ){
                System.out.println("Number is invalid");
                System.out.println("ENTER A Valid number");
                number = input.nextInt();


            }

        if(number == 0) {
            System.out.println("sunday");
        }
        if(number == 1) {
            System.out.println("monday");
        }
        if(number == 2) {
            System.out.println("tuesday");
        }
        if(number == 3) {
            System.out.println("wednesday");
        }
        if(number == 4) {
            System.out.println("thursday");
        }
        if(number == 5) {
            System.out.println("friday");
        }
        if(number == 6) {
            System.out.println("saturday");
        }
        }
    }
