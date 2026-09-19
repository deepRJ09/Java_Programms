import java.util.Scanner;

public class neon_checking_without_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("==========================================");
        int square=n*n;
        int division=square/8;
        int add=division-1;
        boolean neon_1=add==n;
        if (neon_1 || square==1 || square==0){
            System.out.println(n+" is a neon number.");
        }
        else {
            System.out.println(n+" is not a neon number.");
        }
        System.out.println("============================================");
    }
}
