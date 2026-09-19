import java.util.Scanner;

public class Write_programme_correcr_the_swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String a: ");
        String a=sc.next();
        System.out.print("Enter The String b: ");
        String b= sc.next();
        String c=b;
        String d=a;
       String e=c.concat(","+d);
        System.out.println(e);
    }
}
