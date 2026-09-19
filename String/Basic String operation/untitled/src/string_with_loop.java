import java.util.Scanner;
import java.lang.*;
public class string_with_loop {
    public static void main(String[] args) {
        try {
            Scanner cs = new Scanner(System.in);
            System.out.print("Enter The String value: ");
            String a = cs.next();
            String b = a;

            for (int i = 0; i >= 0; i++) {
                char c = b.charAt(i);

                System.out.println(c+" "+b.indexOf(c));
            }
        } catch (Exception e) {
            System.out.println("============================");
        }

    }
}
