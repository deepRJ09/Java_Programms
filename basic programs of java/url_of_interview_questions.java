import java.util.Scanner;
import java.util.regex.*;
public class url_of_interview_questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The url which you want: ");
        int want_1= sc.nextInt();
        if (want_1==1) {
            String s = "This is a website: https://www.javainuse.com/misc/regex-interview-questions/";
            String regex = "https?://[\\w.\\-]+\\.[a-z]{2,6}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                String url = matcher.group();
                System.out.println(url);
        }
        }
        else if (want_1==2){
            String s = "This is a website: https://www.javainuse.com/misc/regex-interview-questions/";
            String regex = "https?://[\\w.\\-]+\\.[a-z]+/+[a-z]+/+[a-z]+-+[a-z]+-+[a-z]{2,10}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                String url = matcher.group();
                System.out.println(url);
        }

    }
}
}
