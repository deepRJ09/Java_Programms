import java.util.regex.*;
public class naming_convention {
    public static void main(String[] args) {
        String arr[]=new String[4];
        arr[0]="_deepanshu09";
        arr[1]="deeps_09";
        arr[2]="rocking_deeps_09";
        arr[3]="deepa_nshu";
      Pattern pattern=Pattern.compile("^[_$a-zA-Z][a-zA-Z0-9_$]*$");
      for (String i : arr){
          Matcher m=pattern.matcher(i);
          String s="";
          while (m.find()){
              s+=m.group();
          }
          if (!s.equals("")){
              System.out.println(s+"this is correct ");
          }
          else {
              System.out.println(s+"this is not correct");
          }

      }
    }
}
