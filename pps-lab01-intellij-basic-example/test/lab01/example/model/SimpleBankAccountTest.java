package lab01.example.model;

import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest {
    BankAccountTest simpleBankAccountTest;

    @BeforeEach
    void beforeEach(){
        AccountHolder accountHolder = new AccountHolder("Mario", "Rossi", 1);
        BankAccount bankAccount = new SimpleBankAccount(accountHolder, 0);

        simpleBankAccountTest = new BankAccountTest(accountHolder, bankAccount);
    }

    @Test
    void testInitialBalance() {
        simpleBankAccountTest.testInitialBalance(0);
    }

    @Test
    void testDeposit() {
        simpleBankAccountTest.testDeposit(100);
    }

    @Test
    void testWrongDeposit() {
        simpleBankAccountTest.testWrongDeposit(100);
    }

    @Test
    void testWithdraw() {
        simpleBankAccountTest.testWithdraw(30);
    }

    @Test
    void testWrongWithdraw() {
        simpleBankAccountTest.testWrongWithdraw(100);
    }
}
