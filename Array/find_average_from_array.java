import java.util.Scanner;

public class find_average_from_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of first judge : ");
      double a= sc.nextDouble();
        System.out.print("Enter the marks of second judge : ");
       double b= sc.nextDouble();
       System.out.print("Enter the marks of third judge : ");
      double c= sc.nextDouble();
        System.out.print("Enter the marks of forth judge : ");
   double d=sc.nextDouble();
        System.out.println("===============================================================================");
     double []arr={a,b,c,d};
        int e=arr.length;
     double formula=(a+b+c+d)/e;
        System.out.println("That Make sure your average is: "+formula);
    }
}
