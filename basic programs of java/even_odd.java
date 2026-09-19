import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:  ");
        int number=sc.nextInt();
        int module=number%2;
        boolean Even_Odd=module==0;
        if (Even_Odd){
            System.out.println("its a  Even Number");
        }
        else {
            System.out.println("its a Odd Number");
        }

    }
}
