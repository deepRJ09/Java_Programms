import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of p: ");
        double p= sc.nextDouble();
        System.out.print("Enter the Value of r: ");
        double r= sc.nextDouble();
        System.out.print("Enter the Value of t: ");
        double t= sc.nextDouble();
        double amount=p* Math.pow(1+r/100,t);
        double CI=amount-p;
        System.out.println("Compound Interest: "+CI);
        System.out.println("Amount: "+amount);
    }
}
