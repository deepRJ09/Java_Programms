public class encapsulation_1 {
    public static void main(String[] args) {
        System.out.println("===========================================================================================");
        System.out.println("BANK MANAGEMENT");
        BankAccount account = new BankAccount("AC1001", "Deep", 1234);
        account.deposit(5000);
        account.withdraw(1200, 1234);
        account.changePin(1234, 5678);
        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("===========================================================================================");
        System.out.println("\nPLAYSTATION");
        PlayStation player = new PlayStation("DeepaGamer");
        player.login();
        player.startGame("Gran Turismo");
        player.addPlayingHours(3);
        System.out.println("Player: " + player.getUsername());
        System.out.println("Current game: " + player.getGame());
        System.out.println("Hours played: " + player.getHoursPlayed());
        player.logout();
        System.out.println("===========================================================================================");
    }
}
