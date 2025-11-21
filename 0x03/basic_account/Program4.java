import java.util.Locale;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);
        try {
            BasicBankAccount1 account1 = new BasicBankAccount1("AAA", 50.0);
            System.out.printf("Account %s - balance: %.2f\n", account1.getAccountNumber(), account1.getBalance());
            account1.deposit(100);
            System.out.printf("Account %s - balance: %.2f\n", account1.getAccountNumber(), account1.getBalance());
            account1.withdraw(25);
            System.out.printf("Account %s - balance: %.2f\n", account1.getAccountNumber(), account1.getBalance());
            account1.applyMonthlyUpdate();
            System.out.printf("Account %s - balance: %.2f\n\n", account1.getAccountNumber(), account1.getBalance());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            BasicBankAccount1 account2 = new BasicBankAccount1("BBB", 100.0);
            System.out.printf("Account %s - balance: %.2f\n", account2.getAccountNumber(), account2.getBalance());
            account2.deposit(10);
            System.out.printf("Account %s - balance: %.2f\n", account2.getAccountNumber(), account2.getBalance());
            account2.withdraw(10);
            System.out.printf("Account %s - balance: %.2f\n", account2.getAccountNumber(), account2.getBalance());
            account2.applyMonthlyUpdate();
            System.out.printf("Account %s - balance: %.2f\n\n", account2.getAccountNumber(), account2.getBalance());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            BasicBankAccount1 account3 = new BasicBankAccount1("CCC", 120.0);
            System.out.printf("Account %s - balance: %.2f\n", account3.getAccountNumber(), account3.getBalance());
            account3.deposit(1600);
            System.out.printf("Account %s - balance: %.2f\n", account3.getAccountNumber(), account3.getBalance());
            account3.applyMonthlyUpdate();
            System.out.printf("Account %s - balance: %.2f\n\n", account3.getAccountNumber(), account3.getBalance());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            BasicBankAccount1 account4 = new BasicBankAccount1("DDD", 70.0);
            System.out.printf("Account %s - balance: %.2f\n", account4.getAccountNumber(), account4.getBalance());
            account4.deposit(0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            BasicBankAccount1 account5 = new BasicBankAccount1("EEE", 50.0);
            System.out.printf("Account %s - balance: %.2f\n", account5.getAccountNumber(), account5.getBalance());
            account5.deposit(25);
            System.out.printf("Account %s - balance: %.2f\n", account5.getAccountNumber(), account5.getBalance());
            account5.withdraw(30);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }
}
