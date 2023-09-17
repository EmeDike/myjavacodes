import java.util.Scanner;

public class Account1Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Initial Balance");
        int initialBalance = input.nextInt();

        Account2 account = new Account2(initialBalance);

        System.out.println("Enter Deposit Amount");
        int depositAmount = input.nextInt();
        account.deposit(depositAmount);

        System.out.println("Enter Withdrawal Amount");
        int withdrawalAmount = input.nextInt();
        account.withdrawal(withdrawalAmount);

        System.out.println("Final Balance: " + account.checkBalance());
    }
}
