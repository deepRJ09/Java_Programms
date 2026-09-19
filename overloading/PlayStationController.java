public class PlayStationController {
    static void connect(String controller) {
        System.out.println(controller + " connected");
    }

    static void connect(String controller, int player) {
        System.out.println(controller + " connected for player " + player);
    }

    static void connect(String controller, int player, String color) {
        System.out.println(color + " " + controller + " connected for player " + player);
    }

    public static void main(String[] args) {
        connect("DualSense");
        connect("DualSense", 1);
        connect("DualSense", 2, "red");
    }
}
