import java.util.Scanner;

public class display_prime_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int N= sc.nextInt();
        System.out.println("===============================================================================");
        System.out.print("Prime Numbers: [");
        for (int i=2;i<=N;i++){
            boolean prime=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    prime=false;
                    break;
                }
            }
            if (prime){
                System.out.print(i+" ");
            }
        }
        System.out.print("]");
    }
}
