import java.util.Scanner;
import java.util.regex.*;
public class email_extracting_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Email Extracting System:-");
        System.out.println("===================================================");
        System.out.print("Enter The email: ");
        String a=sc.next();
        String regex="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(a);
        boolean isEmail=matcher.matches();
        if (isEmail) {
            String[] b = a.split("\\d");
            System.out.println("===================================================");
            System.out.print("This is your Fresh Email: ");
            for (String s : b) {
                System.out.print(s);
            }
        }
        else {
            System.out.println("Enter Valid Email");
        }
    }
}
