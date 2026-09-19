import java.util.Scanner;

public class millions_to_cr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of million: ");
        double millions=sc.nextDouble();
        System.out.println("===================================");
        System.out.println("You entered: "+millions+"M\n");
        System.out.print("for converting enter the (y/n): ");
        String convert= sc.next();
        System.out.println("===================================");
        if (convert.equals("y")){
            double cr=millions*0.1;
            System.out.println("Corers: "+cr+"CR");
        }
else {
            System.out.println("okk");
        }

    }
}
