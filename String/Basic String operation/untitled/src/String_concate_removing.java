public class String_concate_removing {
    public static void main(String[] args) {
        String a="Deepanshu";
        String b=a.concat(" Bharadwaj");
        System.out.println(b);
        String c=a+b;
        System.out.println(c.replace("Bharadwaj","Deeps"));
    }
}
