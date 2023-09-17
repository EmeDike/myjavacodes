import java.util.Scanner;

public class ClassWorkxandn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x ");
        int x = input.nextInt();
        System.out.println("Enter the value of n ");
        int n = input.nextInt();

        //x * x
        int resultantValue = (int) Math.pow(x,n);
        System.out.println(resultantValue );

    }
}
