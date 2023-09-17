public class Account {
    private int balance;
    private int amount;

    public void deposit(int amount) {
        if (amount > 0 && amount >= balance);
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        if (amount > 0 && amount <= balance);
        balance -= amount;
    }

    public void showLoveTo(Account cherish, int  amount) {
        if (amount > 0 && amount <= balance);
        balance = balance - amount;
    }
}

