import java.util.Scanner;
public class change_the_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String a=sc.next();
        System.out.println(a.replaceAll("\\d","%"));
    }
}
