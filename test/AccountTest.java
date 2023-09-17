import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void accountDeposit() {
        Account dd = new Account();
        dd.deposit(2000);
        assertEquals(2000, dd.getBalance());
    }
    @Test
    public void multipleDepossit(){
        Account dd = new Account();
        dd.deposit(300);
        dd.deposit(200);
        dd.deposit(700);
        assertEquals(1200, dd.getBalance());
    }
    @Test
    public void withdrawal() {
        Account dd = new Account();
        dd.deposit(3000);
        dd.withdrawal(1000);
        assertEquals(2000, dd.getBalance());
    }
    @Test
    public void transferTest(){
        Account dd = new Account();
        Account cherish = new Account();
        dd.deposit(5000);
        dd.showLoveTo(cherish, 2000);
        int checkBalance = dd.getBalance();
        assertEquals(3000, checkBalance);
    }
}

