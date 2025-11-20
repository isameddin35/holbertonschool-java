import exceptions.InvalidOperationException;

public class BasicBankAccount {

    private String accountNumber;
    private double balance = 0;
    private double annualInterestRate;

    BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    void deposit(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }
        balance += value;
    }

    void withdraw(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        } else if (value > balance) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        } else {
            balance -= value;
        }
    }

    double calculateMonthlyFee() {
        double monthlyFee = balance / 10;
        if (monthlyFee > 10) {
            return 10;
        } else return monthlyFee;
    }

    double calculateMonthlyInterest() {

        double monthlyInterest;
        double monthlyInterestRate = getAnnualInterestRate() / 100 / 12;
        if (balance >= 0) {
            monthlyInterest = balance * monthlyInterestRate;
            return monthlyInterest;
        } else {
            return 0;
        }
    }

    void applyMonthlyUpdate() {
        balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }
}
