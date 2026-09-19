import java.util.Scanner;

public class check_vowel_or_constant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character: ");
        String input= sc.next();
        char converted= input.toLowerCase().charAt(0);
        boolean compare=converted=='a'|| converted=='e'|| converted=='i'|| converted=='o'|| converted=='u';
        if (compare){
            System.out.println(input+" is a vowel.");
        }
        else {
            System.out.println(input+" is a constant");
        }

    }
}
