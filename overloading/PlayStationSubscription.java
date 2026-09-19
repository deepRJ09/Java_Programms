public class PlayStationSubscription {
    static void subscribe(String user) {
        System.out.println(user + " subscribed to PlayStation Plus");
    }

    static void subscribe(String user, int months) {
        System.out.println(user + " subscribed for " + months + " months");
    }

    static void subscribe(String user, int months, String plan) {
        System.out.println(user + " subscribed to the " + plan
                + " plan for " + months + " months");
    }

    public static void main(String[] args) {
        subscribe("Deepanshu");
        subscribe("Bharadwaj", 3);
        subscribe("Chandametta", 12, "Premieum");
    }
}
