import java.util.regex.*;
public class regex_index_methods {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("(Deeps)");
        Matcher matcher= pattern.matcher("I am Deeps");
        if (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }
}
