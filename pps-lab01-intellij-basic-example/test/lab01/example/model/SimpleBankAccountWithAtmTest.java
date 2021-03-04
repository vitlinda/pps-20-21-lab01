package lab01.example.model;

import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountWithAtmTest {
    BankAccountTest simpleBankAccountWithAtmTest;

    @BeforeEach
    void beforeEach(){
        AccountHolder accountHolder = new AccountHolder("Mario", "Rossi", 1);
        BankAccount bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);

        simpleBankAccountWithAtmTest = new BankAccountTest(accountHolder, bankAccount);
    }

    @Test
    void testInitialBalance() {
        simpleBankAccountWithAtmTest.testInitialBalance(0);
    }

    @Test
    void testDeposit() {
        simpleBankAccountWithAtmTest.testDeposit(99);
    }

    @Test
    void testWrongDeposit() {
        simpleBankAccountWithAtmTest.testWrongDeposit(99);
    }

    @Test
    void testWithdraw() {
        simpleBankAccountWithAtmTest.testWithdraw(30);
    }

    @Test
    void testWrongWithdraw() {
        simpleBankAccountWithAtmTest.testWrongWithdraw(99);
    }
}
