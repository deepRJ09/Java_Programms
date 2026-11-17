import java.util.Scanner;

class  operators{
    void overloaded(int a,int b){
        System.out.println("==========================================================================================");
        System.out.print("output: ");
        System.out.println(a+b);
        System.out.println("==========================================================================================");
    }
    void  overloaded(String a, String b){
        System.out.println("==========================================================================================");
        System.out.println("Output: "+a+" "+b);
        System.out.println("==========================================================================================");
    }
}
public class operator_overloading {
    public static void main(String[] args) {
        operators op=new operators();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input: ");
        String input=scanner.nextLine();
        String[] out=input.split("[+]");
        String a=out[0];
        String b=out[1];
        String c=a+"+"+b+"+";
        if (input.length()<c.length()) {
            try {
                int new_a = Integer.parseInt(a);
                int new_b = Integer.parseInt(b);
                op.overloaded(new_a, new_b);
            } catch (NumberFormatException e) {
                op.overloaded(a, b);
            }
        }
        else {
            System.out.println("==========================================================================================");
            System.out.println("wrong input.");
            System.out.println("==========================================================================================");

        }
    }
}
