import java.util.Scanner;

public class SquareRootOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base Number:");
        int base = input.nextInt();
        System.out.println("Enter Exponential Number:");
        int exponential = input.nextInt();

        int answer = 1;

        for (;;) {
            if (answer <= exponential) {

                answer = answer * base;
                System.out.println(answer);
            } else {
                break;
            }
        }
    }
}
