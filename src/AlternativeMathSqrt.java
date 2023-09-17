import java.util.Scanner;

public class AlternativeMathSqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER BASE NUMBER");
        int base = input.nextInt();
        System.out.println("ENTER EXPONENTIAL NUMBER");
        int exponential = input.nextInt();

        int result = 1;
        int result1 = 0;
        for (result = 1; result <= exponential; result++) {
             result1 = result * base;
        }
        System.out.println(result1);
    }
}