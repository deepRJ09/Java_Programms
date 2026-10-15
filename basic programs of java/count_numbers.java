import java.util.InputMismatchException;
import java.util.Scanner;
public class count_numbers {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the input:");
        try {
            int n = sc.nextInt();
            n = Math.abs(n);
            int count = 0;
            if (n == 0) {
                System.out.println("====================================================================================");
                count = 1;
            } else {
                while (n > 0) {
                    n = n / 10;
                    count++;
                }
                System.out.println("========================================================================================");
            }
            System.out.println("count: " + count);
            sc.close();
            System.out.println("========================================================================================");
        }
        catch (InputMismatchException e){
            System.out.println("========================================================================================");
            System.out.println("digits over than 10 .Please Enter under 10 digits.");
            System.out.println("========================================================================================");
        }
    }
}
