import java.util.Locale;
import java.util.regex.*;
public class String_uppercase {
    public static void main(String[] args) {
        String s1="           12aaaBFOYRR23&*";
        String s2= s1.trim();
        System.out.println(s2.indexOf(s1));
        String s=s2.replaceAll("[^a-zA-Z]","");
        System.out.println(s+" :message");
        System.out.println((s.toUpperCase().charAt(0)+s.substring(1).toLowerCase()));
    }
}
