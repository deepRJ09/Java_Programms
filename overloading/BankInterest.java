public class BankInterest {
    static void calculateInterest(int principal, int rate) {
        System.out.println("Simple interest: Rs." + (principal * rate / 100));
    }

    static void calculateInterest(double principal, double rate) {
        System.out.println("Simple interest: Rs." + (principal * rate / 100));
    }

    static void calculateInterest(double principal, double rate, int years) {
        System.out.println("Interest for " + years + " years: Rs."
                + (principal * rate * years / 100));
    }

    public static void main(String[] args) {
        calculateInterest(10000, 5);
        calculateInterest(12500.50, 6.5);
        calculateInterest(20000.00, 7.0, 3);
    }
}
