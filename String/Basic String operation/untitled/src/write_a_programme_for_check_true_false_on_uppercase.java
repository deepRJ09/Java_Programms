import java.util.Scanner;

public class write_a_programme_for_check_true_false_on_uppercase {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter The String : ");
        String a=cs.next();
        String b=a.toUpperCase();

        if (a.equals(b)){
            System.out.println(b.equals(b)+",This string in a uppercase");
        }
else {
            System.out.println(a.equals(b)+",This String is not in a upper case");
        }
    }
}
