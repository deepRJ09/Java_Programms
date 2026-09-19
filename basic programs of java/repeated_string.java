import java.util.Scanner;
public class repeated_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next();
        String s1="";
        String s2="";
        String s3="";
        System.out.println("=============================================");
        for (int i=0;i<s.length();i++){
            int count=0;
           for (int j=0;j<s.length();j++){
               if (s.charAt(i)==s.charAt(j)){
                   count++;
               }
           }
           if (count==1){
               s1=s1+s.charAt(i);
           }
            if (count>2){
                s2=s2+s.charAt(i);
            }
            if (count>3){
                s3=s3+s.charAt(i);
            }

        }
        String s4=s1+s1.length()+s2+s2.length()+s3+s3.length();
        boolean check=s4.length()<=5;
        if (check){
            System.out.println("Valid String");
        }
        else {
            System.out.println("Invalid String ");
        }
    }
}
