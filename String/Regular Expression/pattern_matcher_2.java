import java.util.regex.*;
public class pattern_matcher_2 {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("Deepanshu");
Matcher matcher=pattern.matcher("Deepanshu");
        System.out.println(matcher.find());
    }
}
