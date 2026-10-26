import java.util.Scanner;
public class swapping_with_logic{
    void manage_swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("=======================================================================================");
        System.out.println("output: "+a+","+b);
        System.out.println("=======================================================================================");
    }
    public static void main(String[] args) {
        try {
            swapping_with_logic p = new swapping_with_logic();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the digits:");
            String inp = sc.nextLine();
            String regex = ",";
            String[] split = inp.split(regex);
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            p.manage_swap(a, b);
        }catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("=======================================================================================");
            System.out.println("please enter valid input:- under 10 digits");
            System.out.println("=======================================================================================");
        }
    }
}
