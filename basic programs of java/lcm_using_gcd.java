import java.util.Scanner;

public class lcm_using_gcd {
    static int gcd(int u,int v){
        if(u==0){
            return v;
        }
        return gcd(v%u,u);
    }
    static int lcm(int u,int v){
        return (u/gcd(u,v))*v;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a= sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b=sc.nextInt();
        System.out.println("The lCM of "+a+" and "+b+" is "+lcm(a,b));
    }
}
