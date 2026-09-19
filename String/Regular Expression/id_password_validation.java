import java.util.Scanner;
import java.util.regex.*;
public class id_password_validation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The ID: ");
        String id= sc.next();
        System.out.print("Enter The Password: ");
       String password=sc.next();
        String regex_id="\\D{2}+[a-z]+@+\\d{4}$";
        String regex_pass="\\D{2}+\\d{4}+@+[a-z]+\\d{2}";
        Pattern pattern=Pattern.compile(regex_id);
        Matcher matcher=pattern.matcher(id);
        Pattern pattern1=Pattern.compile(regex_pass);
        Matcher matcher1=pattern1.matcher(password);
        boolean isID=matcher.matches();
        boolean isPass=matcher1.matches();

        if (isID && isPass){
            System.out.println("Valid  ");
        }
else {
            System.out.println(" not valid");
        }

    }
}
