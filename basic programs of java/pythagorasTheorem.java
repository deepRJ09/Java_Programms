import java.util.Scanner;
import java.lang.Math;
public class pythagorasTheorem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input: ");
        String PT=sc.next();
        System.out.println("================================");
        if (PT.equalsIgnoreCase("H")){
        System.out.print("Enter the P: ");
        double P= sc.nextDouble();
        System.out.print("Enter the B: ");
        double B= sc.nextDouble();
        double H=(P*P)+(B*B);
        double sqrt=Math.sqrt(H);
        System.out.println("The H= "+sqrt);
    }
        else if (PT.equalsIgnoreCase("P")){
            System.out.print("Enter the H: ");
            double H= sc.nextDouble();
            System.out.print("Enter the B: ");
            double B= sc.nextDouble();
            double P=(H*H)+(B*B);
            double sqrt=Math.sqrt(P);
            System.out.println("The P= "+sqrt);
        }
        else if (PT.equalsIgnoreCase("B")){
            System.out.print("Enter the P: ");
            double P= sc.nextDouble();
            System.out.print("Enter the H: ");
            double H= sc.nextDouble();
            double B=(P*P)+(H*H);
            double sqrt=Math.sqrt(B);
            System.out.println("The B= "+sqrt);
        }
        else {
            System.out.println("Please enter (H/P/B)!");
        }
    }
}
