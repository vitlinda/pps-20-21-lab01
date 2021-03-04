package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private AccountHolder accountHolder;
    private BankAccount bankAccount;

    public BankAccountTest(AccountHolder holder,BankAccount account) {
        this.accountHolder = holder;
        this.bankAccount = account;
    }

    @Test
    void testInitialBalance(final double expectedValue) {
        assertEquals(expectedValue, bankAccount.getBalance());
    }

    @Test
    void testDeposit(final double expectedValue) {
        bankAccount.deposit(accountHolder.getId(), 100);
        assertEquals(expectedValue, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit(final double expectedValue) {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.deposit(2, 50);
        assertEquals(expectedValue, bankAccount.getBalance());
    }

    @Test
    void testWithdraw(final double expectedValue) {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(accountHolder.getId(), 70);
        assertEquals(expectedValue, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw(final double expectedValue) {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(2, 70);
        assertEquals(expectedValue, bankAccount.getBalance());
    }

}
