package tdd.Account;

public class Account1 {

    private int balance;

    public Account1(int initialBalance) {
        balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdrawal(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public int checkBalance() {
        return balance;
    }
}
