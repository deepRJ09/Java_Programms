import java.util.Scanner;

public class second_largest {
    static  int second_largest_number(int x,int y,int z){
        if(x>=y && x<=z){
            return x;
        } else if (y>=x && y<=z) {
            return  y;
        }
        else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for X: ");
        int x=sc.nextInt();
        System.out.print("Enter the number for Y: ");
        int y=sc.nextInt();
        System.out.print("Enter the number for Z: ");
        int z=sc.nextInt();
       int new_file=second_largest_number(x,y,z);
        System.out.println("=========================================");
        System.out.println("Second Largest no. is :"+new_file);

    }
}
