import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class idSellerValueGetter {
    private int x=2;
    void method(int a) {
        this.x *= a;
        if (this.x == 0) {
            System.out.println("==========================================================================================");

            System.out.print(" Its Free For Sale 🥳");
        } else {
            System.out.println("==========================================================================================");
            System.out.print("This is the value of your id: " + this.x + " rs.");
        }
    }
    int meth(){
        return x;
    }
    public static void main(String[] args) {
        idSellerValueGetter w=new idSellerValueGetter();
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter the value of this id: ");
            String inp = sc.next();
            String s=inp;
            String s3="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            if (s.length()>=5) {
                Pattern pattern=Pattern.compile(s3);
                Matcher matcher=pattern.matcher(s);
                boolean is_Val=matcher.matches();
                if (is_Val) {
                    String s2 = s.replaceAll("[^0-9]", "");
                    int a = Integer.parseInt(s2);
                    w.method(a);
                }
                else {
                    System.out.println("=======================================================================================================================================================================================");

                    System.out.println("Please enter your id from this way=  deepanshu09jun04@gmail.com like etc. like this !");

                }
            }
            else {
                System.out.println("=======================================================================================================================================================================================");

                System.out.println("Please enter your id from this way=  deepanshu09jun04@gmail.com etc. like this and enter the id more than 5 contents !");
            }
        } catch (Exception e) {
            System.out.println("==========================================================================================");

            System.out.println("Please use Ate least One digit !");
        }


    }
}
