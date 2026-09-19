import java.util.Scanner;

public class largest_number_from_three_input {
    static int big_numbers(int x, int y,int z){
        if(x>=y && x>=z){
            return x;
        } else if (y>=x && y>=z) {
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
        int final_output=big_numbers(x,y,z);
        System.out.println("=========================================");
        System.out.println("The largest number is : "+final_output);
    }
}
