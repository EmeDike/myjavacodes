import java.util.Scanner;

public class ClassWorkRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value ");
        int number = input.nextInt();

        int remainder = number % 10;
        System.out.println(remainder);
        int sum = remainder + number;

        System.out.println(sum);


    }
}
