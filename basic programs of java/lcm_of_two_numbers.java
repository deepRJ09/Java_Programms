import java.util.Scanner;

public class lcm_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter for a: ");
        int a= sc.nextInt();
        System.out.print("Enter for b: ");
        int b= sc.nextInt();
        int lcm=(a>b)?a:b;
        while (true){
            if (lcm % a==0 && lcm % b==0){
                break;

            }
            lcm++;
        }
        System.out.println("lcm of "+a+" and "+b+" = "+lcm);
    }
}
