package lab01.example.model;

/**
 * This class represent a particular instance of a BankAccount.
 * In particular, a Simple Bank Account allows always the deposit
 * while the withdraw is allowed only if the balance greater or equal the withdrawal amount
 */
public class SimpleBankAccount extends AbstractBankAccount {
    private static final int FEE = 0;

    public SimpleBankAccount(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    @Override
    public int addFee() {
        return FEE;
    }
}
