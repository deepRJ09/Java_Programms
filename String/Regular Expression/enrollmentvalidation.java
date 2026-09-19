import java.util.regex.*;
public class enrollmentvalidation {
    public static void main(String[] args) {
        String s="1125IT125SRT26";
                String s2="\\d{4}+[A-Z]+\\d{3}+[A-Z]+\\d{2}$";
                Pattern pattern =Pattern.compile(s2);
                Matcher matcher=pattern.matcher(s);
                boolean enroll=matcher.matches();
                if (enroll){
                    System.out.println("valid enrollment");
                }
                else {
                    System.out.println("invalid enrollment");
                }
    }
}
