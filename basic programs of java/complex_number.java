import java.util.Scanner;

public class complex_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits for z1:-(a+bi): ");
        System.out.print("Enter the digits for a: ");
        int a=sc.nextInt();
        System.out.print("Enter the digits for b: ");
        int b= sc.nextInt();
        System.out.println("==================================================");
        System.out.println("Enter the digits for z2:-(c+di):");

        System.out.print("Enter the digits for c: ");
        int c=sc.nextInt();
        System.out.print("Enter the digits for d: ");
        int d= sc.nextInt();
        System.out.println("==================================================");
        int  z_1=a+c;
        int z_2=b+d;
        String z1=a+"+"+b+"i";
        String z2=c+"+"+d+"i";
        String output=z_1+"+"+z_2+"i";
        System.out.println("==================================================");
        System.out.println("Input is:\ncomplex no.1:-z1= "+z1+"\ncomplex no.2:-z2= "+z2);
        System.out.println("==================================================");
        System.out.println("Output:\n"+output);
    }
}
