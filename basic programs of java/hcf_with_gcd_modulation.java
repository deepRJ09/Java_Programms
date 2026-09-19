import java.util.Scanner;
public class hcf_with_gcd_modulation {
    static int gcd(int x,int y){
        if (y==0){
            return x;
        }
        return gcd(x,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value for X: ");
        int x=sc.nextInt();
        System.out.print("Enter the value for Y: ");
        int y=sc.nextInt();
        System.out.println("The HCF of "+x+" and "+y+" is "+gcd(x,y));
    }
}
