class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class main_program {
    public static <T> T choose(T first, T second, boolean chooseFirst) {
        return chooseFirst ? first : second;
    }

    public static <T> void printArray(T[] values) {
        for (T value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Box<String> textBox = new Box<>("Resident Evil 9");
        Box<Integer> numberBox = new Box<>(9);
        Pair<String, Integer> game = new Pair<>(textBox.getItem(), numberBox.getItem());

        String selectedGame = choose("Resident Evil 9", "Resident Evil 8", true);
        String[] characters = {"Leon", "Claire", "Chris"};
        Integer[] episodes = {7, 8, 9};

        System.out.println("Game and episode: " + game);
        System.out.println("Selected game: " + selectedGame);
        System.out.println("Characters:");
        printArray(characters);
        System.out.println("Episodes:");
        printArray(episodes);
    }
}
