import java.util.Scanner;

public class ClassWorkJonathan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = input.nextInt();


        int x =  a + 10;
        System.out.println(x);

        int y = a - 10;
        System.out.println(y);

        int z = a % 10;
        System.out.println(z);

        int product = x * y * z;
        System.out.println(product);

        int certainValue = a / product;

        System.out.println(certainValue);

    }
}
