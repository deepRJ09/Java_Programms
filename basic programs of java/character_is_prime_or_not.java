import java.util.Scanner;

public class character_is_prime_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Character: ");
        String ch= sc.next();
        int length=ch.length();
        if (length==1){
            char character=ch.charAt(0);
            int number=character;
            int module=number%2;
            boolean prime=module==1;
            if (prime){
                System.out.println("Its a prime character.");
            }
            else {
                System.out.println("Its not a prime character.");
            }
        }
        else {
            System.out.println("Please enter any one character only.");
        }
    }
}
