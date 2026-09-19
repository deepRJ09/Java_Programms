class bank {
    static void account(){
        System.out.println("Deposit");
    }
}
public class override_bank extends bank {
    /*override*/static void account(){
        System.out.println("WithDraw");
    }
    public static void main(String[] args) {
        account();
    }
}
