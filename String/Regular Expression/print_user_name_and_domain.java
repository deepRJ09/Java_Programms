public class print_user_name_and_domain {
    public static void main(String[] args) {
        String a="deepansu09jun04@gmail.com";
        String b="@";
        String[] c=a.split(b);
        System.out.println("User Name: "+c[0]);
        System.out.println("Domain Name: "+c[1]);
    }
}