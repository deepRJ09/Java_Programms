import java.util.regex.*;

public class phonevalidation {
    public static void main(String[] args) {
        String a="015-214-0240";
        String b="^\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern=Pattern.compile(b);
        Matcher matcher=pattern.matcher(a);
        boolean phone=matcher.matches();
        if (phone){
            System.out.println("this  number is valid");
        }
        else {
            System.out.println("this number is not valid");
        }

    }
}
