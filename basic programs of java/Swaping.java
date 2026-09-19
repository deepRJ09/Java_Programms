import java.util.Scanner;

public class Swaping {
    public static void Swaped(int x, int y){
        x=x-y;
    y=x+y;
    x=y-x;
        System.out.println("x= "+x+" and y= "+y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value for x: ");
        int x=sc.nextInt();
        System.out.println("===========================================" );
        System.out.print("enter the value for y: ");
        int y= sc.nextInt();
        System.out.println("===========================================" );
Swaped(x,y);
        System.out.println("===========================================" );

    }
}
