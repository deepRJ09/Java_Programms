import java.util.Scanner;

public class check_number_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= sc.nextInt();
        char convert_number_to_character=(char) number;
        System.out.println("This is the character of number : "+convert_number_to_character);
    }
}
