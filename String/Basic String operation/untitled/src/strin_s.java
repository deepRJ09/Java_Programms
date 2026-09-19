import java.util.regex.*;
public class strin_s {
    public static void main(String[] args) {
    String text="deepanshu09jun04@gmail.com";
    Pattern pattern=Pattern.compile("\\d");
    Matcher matcher=pattern.matcher(text);
        System.out.print("Found Digits: ");
    while(matcher.find()){
        System.out.print(matcher.group());
    }

    }
}
