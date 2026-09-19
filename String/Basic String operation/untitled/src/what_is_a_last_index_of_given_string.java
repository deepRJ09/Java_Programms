import java.util.Scanner;

public class what_is_a_last_index_of_given_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String:");
        String a= sc.next();
       int b=a.length()-1;
        System.out.println("The Last Index Of Given String is  "+b+"  Which  is  "+a.charAt(b));

    }
}
