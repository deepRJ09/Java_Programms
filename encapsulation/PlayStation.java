public class PlayStation {
    private final String username;
    private String game;
    private int hoursPlayed;
    private boolean online;

    public PlayStation(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getGame() {
        return game;
    }

    public int getHoursPlayed() {
        return hoursPlayed;
    }

    public boolean isOnline() {
        return online;
    }

    public void login() {
        online = true;
        System.out.println(username + " is now online.");
    }

    public void logout() {
        online = false;
        System.out.println(username + " is now offline.");
    }

    public void startGame(String game) {
        if (!online) {
            System.out.println("Log in before starting a game.");
            return;
        }
        if (game == null || game.isBlank()) {
            System.out.println("Game name cannot be empty.");
            return;
        }
        this.game = game;
        System.out.println("Started game: " + game);
    }

    public void addPlayingHours(int hours) {
        if (hours <= 0) {
            System.out.println("Playing hours must be positive.");
            return;
        }
        hoursPlayed += hours;
    }
}
