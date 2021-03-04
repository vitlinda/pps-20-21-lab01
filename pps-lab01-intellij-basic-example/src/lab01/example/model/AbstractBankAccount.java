package lab01.example.model;

public abstract class AbstractBankAccount implements BankAccount{

    private double balance;
    private final AccountHolder holder;

    public AbstractBankAccount(final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    @Override
    public AccountHolder getHolder(){
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(final int usrID, final double amount) {
        double totalAmount = amount - subtractFee();
        if (checkUser(usrID)) {
            this.balance += totalAmount;
        }
    }

    @Override
    public void withdraw(final int usrID, final double amount) {
        double totalAmount = amount - subtractFee();
        if (checkUser(usrID) && isWithdrawAllowed(totalAmount)) {
            this.balance -= totalAmount;
        }
    }

    public abstract int subtractFee();

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount;
    }

    private boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }


}
