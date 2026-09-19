public class PlayStationGame {
    static void play(String game) {
        System.out.println("Playing " + game);
    }

    static void play(String game, int hours) {
        System.out.println("Playing " + game + " for " + hours + " hours");
    }

    static void play(String game, int hours, String mode) {
        System.out.println("Playing " + game + " for " + hours + " hours in " + mode + " mode");
    }

    public static void main(String[] args) {
        play("FIFA");
        play("Spider-Man", 2);
        play("God of War", 3, "story");
    }
}
