import java.util.Scanner;

class BankAccount {
    protected String accountHolder;
    protected double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Current balance: " + balance);
    }
}

public class BankWithdraw extends BankAccount {
    BankWithdraw(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter opening balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        BankWithdraw account = new BankWithdraw(accountHolder, balance);
        account.withdraw(amount);
        account.showBalance();

        scanner.close();
    }
}