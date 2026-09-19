public class Remove_duplicate_String {
    public static void main(String[] args) {

        String input = "Deepanshu Bharadwaj ";
        String s = input.trim();
        String s1 = "";
        System.out.println("Given String: " + input);
        System.out.println("================================");
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                s1 = s1 + s.charAt(i);
            }
        }
        System.out.println("New String: " + s1);
    }
}