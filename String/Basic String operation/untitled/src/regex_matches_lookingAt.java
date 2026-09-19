import java.util.regex.*;
public class regex_matches_lookingAt {
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile("Deepanshu");
        Matcher matcher= pattern.matcher("Deepanshu is Deepanshu");
        System.out.println(matcher.matches());
        System.out.println(matcher.lookingAt());
        while (matcher.find()){
            System.out.println("Match found");
        }
    }

}
