import java.util.regex.*;
public class programe_patterns {
    public static void main(String[] args) {
        String a="deepanshu09jun04@gmail.com";
        Pattern pattern= Pattern.compile("\\d");
        Matcher matcher=pattern.matcher(a);
        System.out.println(matcher.find());
    }
}
