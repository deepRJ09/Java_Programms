import java.util.Scanner;
public class largest_number_from_three_variables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=sc.nextInt();
        System.out.print("Enter B:");
        int b=sc.nextInt();
        System.out.print("Enter C:");
        int c=sc.nextInt();
        if(a==b && b==c){
            System.out.println("all equals:"+a);
        }
        else if (a>=b && a>=c){
            System.out.println("largest: "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("largest:"+b);
        }
        else  {
            System.out.println("largest:"+c);
        }



    }
}
