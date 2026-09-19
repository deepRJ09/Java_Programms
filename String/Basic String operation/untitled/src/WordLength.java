public class WordLength {

    public static void main(String[] args) {
        try {
            String s = "My Name is Deeps";
            String[] b = s.split(" ");
            int a;

            for (int i = 0; i < s.length(); i++) {
                a = b[i].length();

                System.out.println(b[i] + "---" + a);
            }

        } catch (Exception e) {
            System.out.println("=============================");
        }



    }
}

