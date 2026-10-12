import java.util.Scanner;

public class negative_positive_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int input= sc.nextInt();
        if (input>0){
            System.out.println("positve");
        }
        else if (input<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

    }
}
