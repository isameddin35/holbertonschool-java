import exceptions.InvalidOperationException1;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount;

    FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    void deposit(double value) throws InvalidOperationException1 {
        super.deposit(value);
        setBalance(getBalance() - 0.1);
    }

    @Override
    void withdraw(double value) throws InvalidOperationException1 {
        super.withdraw(value);
        setBalance(getBalance() - 0.1);
    }
}
