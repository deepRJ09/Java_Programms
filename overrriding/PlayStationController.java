class PlayStationControllerBase {
    public void connect() {
        System.out.println("Connecting a game controller");
    }
}

public class PlayStationController extends PlayStationControllerBase {
    @Override
    public void connect() {
        System.out.println("Connecting a PlayStation controller through Bluetooth");
    }

    public static void main(String[] args) {
        PlayStationControllerBase controller = new PlayStationController();
        controller.connect();
    }
}