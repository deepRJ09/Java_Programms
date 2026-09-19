import java.util.Scanner;
public class first_int_to_last_to_first_int {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your input: ");
        int user_input=sc.nextInt();
        int input=user_input;
        int first=input;
        int last=input%10;
        while (first>=10){
            first/=10;
        }
        int middle=(input%100000)/10;
        int output=last*100000+middle*10+first;
        System.out.println("======================================");
        System.out.println("The output: "+output);
    }
}
