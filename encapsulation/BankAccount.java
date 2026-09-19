public class BankAccount {
    private final String accountNumber;
    private String accountHolder;
    private double balance;
    private int pin;

    public BankAccount(String accountNumber, String accountHolder, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isBlank()) {
            System.out.println("Account holder name cannot be empty.");
            return;
        }
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN.");
        } else if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void changePin(int oldPin, int newPin) {
        if (oldPin != pin) {
            System.out.println("Incorrect old PIN.");
        } else if (newPin < 1000 || newPin > 9999) {
            System.out.println("PIN must contain exactly 4 digits.");
        } else {
            pin = newPin;
            System.out.println("PIN changed successfully.");
        }
    }
}
