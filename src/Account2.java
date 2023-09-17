public class Account2 {
    private int balance;

    public Account2(int initialBalance) {
        if (initialBalance <= 0) {
            System.out.println("Invalid Amount");
        } else {
            balance = initialBalance;
        }
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            balance += amount;
            System.out.println(amount + " deposited successfully");
        }
    }

    public void withdrawal(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        }
    }

    public int checkBalance() {
        return balance;
    }
}
