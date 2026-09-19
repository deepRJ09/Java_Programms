import java.util.Scanner;
interface first{
    final double x=20;
}
interface second{
    final double y=5;
}
class Third implements first,second{
   void run(double a){
      double c=a*x*y;
       System.out.println("this is in inc : "+c+"rs.");
   }
}
public class Dollar_to_rupees {
    public static void main(String[] args) {
        Third t=new Third();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of $_Dollar: ");
        double a= sc.nextDouble();// h/w={this keyword, super keyword, final keyword, abstract keyword}
        System.out.println("============================================================================================");
        t.run(a);
    }
}
