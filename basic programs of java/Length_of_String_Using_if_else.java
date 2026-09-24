import java.util.Scanner;
public class Length_of_String_Using_if_else {
    void checking(String s){
        if (s.length()>=20) {
            System.out.println("================================================================");
            System.out.println("Its Eligible");
        }
        else {
            System.out.println("================================================================");
            System.out.println("Its Not Eligible");
        }
}
    public static void main(String[] args) {
        Length_of_String_Using_if_else output=new Length_of_String_Using_if_else();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Input : ");
        String s=sc.next();
        output.checking(s);
    }
}
