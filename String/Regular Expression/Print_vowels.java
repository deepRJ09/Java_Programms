import java.util.regex.*;
public class Print_vowels {
    public static void main(String[] args) {
        String arr[]=new String[4];
        arr[0]="C";
        arr[1]="I";
        arr[2]="D";
        arr[3]="Mumbai";
        for (String s:arr){
            if (Pattern.matches("^[AEIOUaeiou][A-Za-z]*",s)){
                System.out.println(s+" is a valid string.");
            }
            else {
                System.out.println(s+" is a invalid string.");
            }

        }
    }
}
