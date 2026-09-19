import java.util.regex.*;
public class replacement_undersocre_to_space {
    public static void main(String[] args) {
        String a="My Name is Deepanshu";
    String b="\\s";
    String c="_";
    Pattern pattern=Pattern.compile(b);
    Matcher matcher=pattern.matcher(a);
    String d=matcher.replaceAll(c);
        System.out.println(d);
    }
}
