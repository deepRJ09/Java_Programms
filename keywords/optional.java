import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        Optional<String> name=Optional.ofNullable(null);
        System.out.println(name.orElse("Guest"));
    }
}
