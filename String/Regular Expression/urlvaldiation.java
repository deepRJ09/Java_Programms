import java.util.regex.*;
public class urlvaldiation {
    public static void main(String[] args) {
        String s = "This is a website: https://chanting.free.je/";
        String r = "https?://[\\w.\\-]+\\.[a-z]{2,6}";

        Pattern pattern=Pattern.compile(r);
Matcher matcher=pattern.matcher(s);
while(matcher.find()){
    String url=matcher.group();
    System.out.println(url);
}
    }
}
