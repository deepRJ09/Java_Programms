public class interns {
    public static void main(String[] args) {
        String s1= new String("ABC");
        String s2=s1.intern();
        System.out.println(s2==s1);
    }
}
