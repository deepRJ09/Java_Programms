public class int_greater_smaller {
    public static void main(String[] args) {
        int a = 195478;
        String s = String.valueOf(a);
        int[] b = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            b[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] > b[i + 1]) {
                System.out.print(">");

            } else {
                System.out.print("<");
            }
        }
    }
}