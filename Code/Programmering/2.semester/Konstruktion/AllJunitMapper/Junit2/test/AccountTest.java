import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    //Arrange
    Account account = new Account();

    @Test
    void deposit() {
        //Act
        float expected = 2000;
        //Lægger penge på kontoen
        account.deposit(2000);
        float actual = account.getBalance();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void withdraw() {
        float expected = 1500;
        account.withdraw(500);
        float actual = account.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void transferFunds() {
    }
}