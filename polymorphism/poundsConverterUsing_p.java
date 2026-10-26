import java.util.InputMismatchException;
import java.util.Scanner;
public class poundsConverterUsing_p {
    private  double access=126.57;
    void setAccess(int access){
        this.access*=access;
        System.out.println("The inr : "+this.access);
    }
    void setAccess(int access , int access_2){
        this.access*=access+access_2;
        System.out.println("The Inr :"+this.access);
    }
    public static void main(String[] args) {
        poundsConverterUsing_p p=new poundsConverterUsing_p();
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter the process: ");
            int inp = sc.nextInt();
            if (inp == 2) {
                System.out.println("=======================================================================================");
                System.out.print("Enter the first value of pounds: ");
                int inp_2 = sc.nextInt();
                System.out.println("=======================================================================================");
                System.out.print("Enter the second value value of pounds: ");
                int inp_3 = sc.nextInt();
                System.out.println("=======================================================================================");
                p.setAccess(inp_2, inp_3);
                System.out.println("=======================================================================================");
            } else if (inp == 1) {
                System.out.println("=======================================================================================");
                System.out.print("Enter the value of pounds: ");
                int inp_2 = sc.nextInt();
                System.out.println("=======================================================================================");
                p.setAccess(inp_2);
                System.out.println("=======================================================================================");
            } else {
                System.out.println("=======================================================================================");
                System.out.println("please enter variable under 1 or 2 for validation of process");
                System.out.println("=======================================================================================");
            }
        }
        catch (InputMismatchException e){
            System.out.println("=======================================================================================");
            System.out.println("invalid input\ninput is mismatch please enter valid input\nand also please enter variable under 1 or 2 for validation of process ");
            System.out.println("=======================================================================================");

        }
    }
}
