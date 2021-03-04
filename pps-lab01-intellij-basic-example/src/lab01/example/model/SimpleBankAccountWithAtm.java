package lab01.example.model;

public class SimpleBankAccountWithAtm extends AbstractBankAccount {
    private static final int FEE = 1;

    public SimpleBankAccountWithAtm(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    @Override
    public int addFee() {
        return FEE;
    }
}
