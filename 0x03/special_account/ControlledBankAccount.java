public class ControlledBankAccount extends BasicBankAccount {
    private double minimumBalance;
    private double penaltyAmount;

    ControlledBankAccount(String accountNumber, double annualInterestRate ,double minimumBalance, double penaltyAmount) {
        super(accountNumber, annualInterestRate);
        this.minimumBalance = minimumBalance;
        this.penaltyAmount = penaltyAmount;

    }

    @Override
    void applyMonthlyUpdate() {
        double newBalance = getBalance() - calculateMonthlyFee() + calculateMonthlyInterest();
        if (newBalance < minimumBalance) {
            newBalance = newBalance - penaltyAmount;
            setBalance(newBalance);
        } else {
            setBalance(newBalance);
        }
    }
}
