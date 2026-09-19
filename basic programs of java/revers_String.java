import java.util.Scanner;

public class revers_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.next();
        String new_str=str;
        String reverse="";
        int length=str.length();
        for (int i=length-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse+" is a reverse of "+new_str);
    }
}
