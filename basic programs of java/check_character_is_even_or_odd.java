import java.util.Scanner;

public class check_character_is_even_or_odd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character: ");
        String character= sc.next();
        int ch_num=character.length();
        if (ch_num==1){
            char character2=character.charAt(0);
            int number=character2;
            int module=number%2;
            boolean Prime_character=module==0;
            if (Prime_character){
                System.out.println("its a even");
            }
            else {
                System.out.println("Its odd");
            }

        }
        else {
            System.out.println("please enter any one  character only");
        }
    }
}
