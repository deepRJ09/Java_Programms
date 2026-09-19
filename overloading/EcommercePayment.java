public class EcommercePayment {
    static void pay(int amount) {
        System.out.println("Paid Rs." + amount + " by cash");
    }

    static void pay(double amount) {
        System.out.println("Paid Rs." + amount + " by card");
    }

    static void pay(double amount, String method) {
        System.out.println("Paid Rs." + amount + " using " + method);
    }

    public static void main(String[] args) {
        pay(500);
        pay(899.50);
        pay(1200.00, "UPI");
    }
}
