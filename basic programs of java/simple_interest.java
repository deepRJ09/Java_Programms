import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of p: ");
       double p= sc.nextDouble();
        System.out.print("Enter the Value of r: ");
        double r= sc.nextDouble();
        System.out.print("Enter the Value of t: ");
        double t= sc.nextDouble();
double SI=p*r*t/100;
        System.out.println("Simple Interest: " +SI);

    }
}
