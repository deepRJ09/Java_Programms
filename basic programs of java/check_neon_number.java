import java.util.Scanner;

public class check_neon_number {
public static  boolean check_neon(int n){
    int square=n*n;
    int sum=0;
    while (square>0){
        sum+=square%10;
        square/=10;
    }
    return sum==n;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        if (check_neon(n)){
            System.out.println("its a neon number.");
        }
        else {
            System.out.println("its not a neon number.");
        }
    }
}
