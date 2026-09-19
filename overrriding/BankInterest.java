class BankInterestBase {
    public double calculateInterest(double balance) {
        return balance * 0.02;
    }
}

public class BankInterest extends BankInterestBase {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.05;
    }

    public static void main(String[] args) {
        BankInterestBase interest = new BankInterest();
        System.out.println("Interest: " + interest.calculateInterest(10000));
    }
}