import java.util.ArrayList;
import java.util.List;

class CharacterProfile<T> {
    private final String name;
    private final T specialAbility;

    public CharacterProfile(String name, T specialAbility) {
        this.name = name;
        this.specialAbility = specialAbility;
    }

    public void display() {
        System.out.println(name + " - Ability: " + specialAbility);
    }
}

class Inventory<T> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void showItems() {
        for (T item : items) {
            System.out.println("- " + item);
        }
    }
}

public class ResidentEvilRequiem {
    public static <T> T choose(T first, T second, boolean chooseFirst) {
        return chooseFirst ? first : second;
    }

    public static void main(String[] args) {
        CharacterProfile<String> grace =
                new CharacterProfile<>("Grace Ashcroft", "Investigation");
        CharacterProfile<Integer> leon =
                new CharacterProfile<>("Leon S. Kennedy", 100);

        Inventory<String> inventory = new Inventory<>();
        inventory.addItem("Handgun");
        inventory.addItem("First Aid Spray");
        inventory.addItem("Puzzle Key");

        String selectedMode = choose("Story Mode", "Survival Mode", true);

        System.out.println("=== Resident Evil Requiem ===");
        System.out.println("Characters:");
        grace.display();
        leon.display();
        System.out.println("\nInventory:");
        inventory.showItems();
        System.out.println("\nSelected mode: " + selectedMode);
    }
}
