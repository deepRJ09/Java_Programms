import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class String_id_passowrod_fetching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the id: ");
        String id=sc.next();
        System.out.print("Enter the password: ");
        String password=sc.next();
String regexid="[A-Z]+[0-9]+@+[a-z]";
String regexpass="[a-z]+[@,#]+[0-9]";
        Pattern pattern=Pattern.compile(regexid);
        Pattern pattern1=Pattern.compile(regexpass);
        Matcher matcher=pattern.matcher(id);
        Matcher matcher1=pattern1.matcher(password);
        boolean ID=matcher.find();
        boolean Pass=matcher1.find();
        if (ID|| Pass){
            System.out.println("============================================================================");
            System.out.println("yes");
        }
        else {
            System.out.println("============================================================================");
            System.out.println("No");
        }
    }
}
