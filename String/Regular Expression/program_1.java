public class program_1 {
    public static void main(String[] args) {
        String s="deepanshu09jun04@gmail.com";
        System.out.println(s.replaceAll("[a-z 0-9]","*"));
        System.out.println(s.replaceAll("[a-z]","*"));
        System.out.println(s.replaceAll("[0-9]","*"));
        System.out.println(s.replaceAll("[a-z A-Z]","*"));
        System.out.println(s.replaceAll("[^a-z A-Z]","*"));
        System.out.println(s.replaceAll("[^0-9]","*"));
        System.out.println(s.replaceAll("[^a-z]","*"));
        System.out.println(s.replaceAll("[^a-z 0-9]","*"));
        System.out.println(s.replaceAll("[^a-z 0-9[.]]","*"));
        System.out.println(s.replaceAll("[^a-z A-Z[.,@]]","*"));
        System.out.println(s.replaceAll("[^a-z A-Z[.@]]","*"));
        System.out.println(s.replaceAll("[^a-z 0-9[.@]]","*"));
    }
}
