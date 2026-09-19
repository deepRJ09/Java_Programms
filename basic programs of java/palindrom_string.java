import java.util.Scanner;

public class palindrom_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str= sc.next();
        String new_str=str;
        String reverse="";
        int length=str.length();
        for (int i=length-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if (reverse.equals(new_str)){
            System.out.println(reverse+" is a palindrome string");
        }
        else {
            System.out.println(reverse+" is not a palindrome string");
        }
    }
}
