class EcommercePaymentBase {
    public void pay(double amount) {
        System.out.println("Making a standard payment of " + amount);
    }
}

public class EcommercePayment extends EcommercePaymentBase {
    @Override
    public void pay(double amount) {
        System.out.println("Making a secure online payment of " + amount);
    }

    public static void main(String[] args) {
        EcommercePaymentBase payment = new EcommercePayment();
        payment.pay(1499);
    }
}