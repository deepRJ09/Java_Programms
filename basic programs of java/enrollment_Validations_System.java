import java.util.Scanner;
import java.util.regex.*;

public class enrollment_Validations_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the enrollment: ");
        String enrollment = sc.next();
        System.out.println("================================");
        System.out.print("Enter the password: ");
        String password = sc.next();
        System.out.println("================================");
        String regrex = "\\d{4}+[A-Z]+\\d{3}+[A-Z]+\\d{2}$";
        String regex="[A-Z]+[a-z]+@+\\d{4}";
        Pattern pattern = Pattern.compile(regrex);
        Pattern pattern_2 = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(enrollment);
        Matcher matcher1=pattern_2.matcher(password);
        boolean enroll = matcher.matches();
        boolean pass=matcher1.matches();
        boolean Enroll_Pass=!enroll && !pass;
        if (Enroll_Pass){
            System.out.print("Enrollment and Password Both are Invalid.");
        }
        else {
            if (enroll && pass) {
                System.out.println("Your Enrollment is valid successfully with your password.\nyou are available to login with it.");
            } else if (!enroll) {
                System.out.println("Invalid Enrollment.");
            } else if (!pass) {
                System.out.println("Invalid password.");
            }
        }

    }

}
