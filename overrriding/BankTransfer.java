class BankTransferBase {
    public void transfer(double amount) {
        System.out.println("Transferring " + amount + " through a standard account");
    }
}

public class BankTransfer extends BankTransferBase {
    @Override
    public void transfer(double amount) {
        System.out.println("Transferring " + amount + " securely between bank accounts");
    }

    public static void main(String[] args) {
        BankTransferBase transfer = new BankTransfer();
        transfer.transfer(2500);
    }
}