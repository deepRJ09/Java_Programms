import java.util.Scanner;

public class millions_to_lakh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of millions: ");
        double millions=sc.nextDouble();
        System.out.println("============================");
        System.out.println("you entered: "+millions+"M\n");
        System.out.print("Enter for confirmation (y/n): ");
        String convert=sc.next();
        if (convert.equals("y")){
            double lak=millions*10;
            System.out.println("Lakhs: "+lak+"L");
        }
        else {
            System.out.println("okk");
        }
    }
}
