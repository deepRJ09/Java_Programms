import java.util.Scanner;

public class covert_capital_to_small_and_small_to_capital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String a=sc.next();
        String b=a.toUpperCase();
        String c=a.toLowerCase();
        if (a.equals(b)){
            System.out.println(c);
        }
        else if (a.equals(c)){
            System.out.println(b);
        }
        else {
            System.out.println("Enter the all string is in pure capital or pure small!");
        }
    }
}
