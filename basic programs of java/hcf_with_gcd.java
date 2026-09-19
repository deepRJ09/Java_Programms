import java.util.Scanner;

public class hcf_with_gcd {
    static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return x;
        }
        if (x == y) {
            return x;
        }
        if (x>y){
            return gcd(x-y,y);
        }
        return gcd(x, y - x);
       }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int x= sc.nextInt();
        System.out.print("Enter the value of Y: ");
        int y=sc.nextInt();
        System.out.println("The HCF of "+x+" and "+y+" is "+gcd(x,y));
    }
}
