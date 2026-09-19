class PlayStationGameBase {
    public void startGame() {
        System.out.println("Starting a video game");
    }
}

public class PlayStationGame extends PlayStationGameBase {
    @Override
    public void startGame() {
        System.out.println("Starting a PlayStation game and loading the saved profile");
    }

    public static void main(String[] args) {
        PlayStationGameBase game = new PlayStationGame();
        game.startGame();
    }
}