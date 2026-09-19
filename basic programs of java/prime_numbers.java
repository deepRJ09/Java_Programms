import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number=sc.nextInt();
        int modular= number%2;
        boolean Prime_number=modular==1;
        if (Prime_number){
            System.out.println("its a prime number");
        }
        else {
            System.out.println("its not a prime number");
        }



    }
}
