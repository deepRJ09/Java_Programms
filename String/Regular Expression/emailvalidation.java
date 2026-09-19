import java.util.regex.*;
public class emailvalidation {
    public static void main(String[] args) {
        String email="deepanshu09jun04@gmail.com";
        String regex="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(email);
        boolean isEmailValid = matcher.matches();
if (isEmailValid){
    System.out.println("email is valid");
}
else {
    System.out.println("is not valid");
}
    }

}
