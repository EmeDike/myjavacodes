package SirChibuzorsClassWork;

import java.util.Scanner;
public class ClassWork4 {

    public static void main(String[] args) {
        int count = 1;
        int evenSum = 0;
        int number = 10;


        for (count = 1; count <= number; count++) {
            if (count % 2 == 0) {
                evenSum = evenSum + count;


            }
        }
            System.out.println("The Sum of Even Numbers = "  + evenSum);
        }
    }
