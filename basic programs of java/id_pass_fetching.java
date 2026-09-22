import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class id_pass_fetching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id : ");
        String ID= sc.next();
        String id=ID;
        System.out.println("=======================================================================================");

        System.out.print("Enter the password: ");
        String pass=sc.next();
        String passwd=pass;


        String fetch_id="[A-Z]+[a-z]+[0-9]+@+[a-z]+[.]+[a-z]";
        Pattern pattern=Pattern.compile(fetch_id);
        Matcher matcher=pattern.matcher(id);
        String pass_fetching="[A-Z]+[0-9]+[$]+[a-z]";
        Pattern pattern1=Pattern.compile(pass_fetching);
        Matcher matcher1=pattern1.matcher(passwd);
       boolean is_find= matcher.find();
       boolean is_FInd=matcher1.find();
       if (is_find && is_FInd){
           System.out.println("=======================================================================================");
           System.out.println("Process Successful");
           System.out.println("=======================================================================================");
       }
       else {
           System.out.println("=======================================================================================");
           System.out.println("Wrong Process of Fetching");
           System.out.println("=======================================================================================");

       }

    }
}