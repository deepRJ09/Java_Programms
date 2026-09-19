public class Dived_A_String_into_two_parts_with_length{
    public static void main(String[] args) {
        String a="Deepanshu.Bharadwaj";
        String []b=a.split("[.]");
        System.out.println("String: "+b[0]+" Length: "+b[0].length());
        System.out.println("String: "+b[1]+" Length : "+b[1].length());
    }
}