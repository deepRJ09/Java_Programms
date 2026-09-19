public class concate_two_String_after_replacing_with_length {
    public static void main(String[] args) {
        String a="Deepanshu";
        String b="Bharadwaj";
        String c=a.replace(a,b);
        String d=b.replace(b,a);
        String e=c.concat(" "+d);
        System.out.println(e);
    }
}
