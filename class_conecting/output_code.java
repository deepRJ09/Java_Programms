import java.util.Scanner;
public class output_code {
    public static void main(String[] args){
        create c=new create();
        new_code newCode=new new_code();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value Of International Amount : ");
        String input=sc.nextLine();
        String replaced=input.replaceAll("[a-z]","");
        int input_international_ammount =0;
            double b=0;
         try {
      input_international_ammount+= Integer.parseInt(replaced);
             newCode.code(input_international_ammount);
         } catch (NumberFormatException e) {
b+=Double.parseDouble(replaced);
          c.karate(b);
         }

    }
}