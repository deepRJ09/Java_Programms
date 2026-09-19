public class BankAccount {
    static void openAccount(String name) {
        System.out.println("Savings account opened for " + name);
    }

    static void openAccount(String name, int accountNumber) {
        System.out.println("Account " + accountNumber + " opened for " + name);
    }

    static void openAccount(String name, int accountNumber, double balance) {
        System.out.println("Account " + accountNumber + " opened for " + name
                + " with Rs." + balance);
    }

    public static void main(String[] args) {
        openAccount("Anu");
        openAccount("Rahul", 1001);
        openAccount("Meena", 1002, 5000.00);
    }
}
