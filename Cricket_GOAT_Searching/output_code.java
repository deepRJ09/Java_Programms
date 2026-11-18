import java.util.InputMismatchException;
import java.util.Scanner;
public class output_code {
    public static void main(String[] args) {
        create c=new create();
        new_code newCode=new new_code();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the jersey no. : ");
            int input_jersey_num =0;
            double b=0;
            String input="";
         try {
      input_jersey_num+= sc.nextInt();
             newCode.code(input_jersey_num);
         } catch (InputMismatchException e) {
             input+=sc.nextLine();
             int a=input.length();
             c.karate(a);


         } catch (RuntimeException e) {
             b+=sc.nextDouble();
             c.karate(b);

         }

    }
}
