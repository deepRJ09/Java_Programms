import java.util.Scanner;

public class check_character_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number: ");
        String character=sc.next();
        int ch_num=character.length();
        if (ch_num == 1){
        char character2=character.charAt(0);
        int number=character2;
        System.out.println("This is the character number in java : "+number);
    }
        else {
            System.out.println("The input is invalid because \nits a string not a character\nplease enter any single character for output");
        }
    }
}
