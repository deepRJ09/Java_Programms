import java.util.regex.*;
public class regex_string_match {
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile("java");
        Matcher matcher=pattern.matcher("java is java");
        System.out.println(matcher.find());
    }
}
