import java.util.Scanner;
class start{
  final   char input='a';
    final int num=0;
    start(char a){
        System.out.println("this is a roll number: "+(a+input+num));
    }
}
public class find_roll_number_from_Character_id {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input id character: ");
     String id=sc.next();
     char passkey_character=id.charAt(0);
        start s=new start(passkey_character);
        System.out.println(s.getClass());
    }
}
