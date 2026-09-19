public class BankWithdraw {
    static void withdraw(String customer, int amount) {
        System.out.println(customer + " withdrew Rs." + amount + " from ATM");
    }

    static void withdraw(String customer, double amount) {
        System.out.println(customer + " withdrew Rs." + amount + " from bank");
    }

    static void withdraw(String customer, double amount, String method) {
        System.out.println(customer + " withdrew Rs." + amount + " using " + method);
    }

    public static void main(String[] args) {
        withdraw("Asha", 1000);
        withdraw("Vijay", 2500.50);
        withdraw("Neha", 5000.00, "cheque");
    }
}
