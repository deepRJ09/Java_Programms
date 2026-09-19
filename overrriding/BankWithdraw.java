class BankWithdrawBase {
    public void withdraw(double amount) {
        System.out.println("Withdrawal requested: " + amount);
    }
}

public class BankWithdraw extends BankWithdrawBase {
    @Override
    public void withdraw(double amount) {
        System.out.println("Cash withdrawal approved: " + amount);
    }

    public static void main(String[] args) {
        BankWithdrawBase withdrawal = new BankWithdraw();
        withdrawal.withdraw(1000);
    }
}