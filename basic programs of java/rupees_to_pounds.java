import java.util.Scanner;
public class rupees_to_pounds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of pounds: ");
        double pounds=sc.nextDouble();
        double convert=pounds*126.57;
        System.out.println("=============================================================================================");
        System.out.println("value of pounds in rs: "+convert);
        System.out.println("=============================================================================================");

    }
}
