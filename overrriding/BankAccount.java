class BankAccountBase {
    public void accountType() {
        System.out.println("General bank account");
    }
}

public class BankAccount extends BankAccountBase {
    @Override
    public void accountType() {
        System.out.println("Savings bank account");
    }

    public static void main(String[] args) {
        BankAccountBase account = new BankAccount();
        account.accountType();
    }
}