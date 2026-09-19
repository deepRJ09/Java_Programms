import java.util.regex.*;
public class pattern_matcher_3 {
    public static void main(String[] args) {
        String s="deepanu09jun04@gmail.com";
        Pattern pattern=Pattern.compile("\\d");
        Matcher matcher=pattern.matcher(s);
        System.out.print("The number of your id: ");
        while(matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
