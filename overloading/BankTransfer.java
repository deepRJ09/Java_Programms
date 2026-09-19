public class BankTransfer {
    static void transfer(String sender, String receiver, int amount) {
        System.out.println(sender + " transferred Rs." + amount + " to " + receiver);
    }

    static void transfer(String sender, String receiver, double amount) {
        System.out.println(sender + " transferred Rs." + amount + " to " + receiver);
    }

    static void transfer(String sender, String receiver, double amount, String note) {
        System.out.println(sender + " transferred Rs." + amount + " to " + receiver
                + " for " + note);
    }

    public static void main(String[] args) {
        transfer("Ravi", "Priya", 500);
        transfer("John", "Sara", 1250.75);
        transfer("Kiran", "Amit", 3000.00, "rent");
    }
}
