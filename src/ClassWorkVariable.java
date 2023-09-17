import java.util.Scanner;

public class ClassWorkVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x ");
        int x = input.nextInt();
        System.out.println("Enter the value of y ");
        int y = input.nextInt();


        int sum = x + y;
        int twiceSum = 2 * sum;

        System.out.println ("twice of sum is " + twiceSum );


    }
}
