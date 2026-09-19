public class Print_First_letter_of_an_eassy {
    public static void main(String[] args) {
            String s = "Deepanshu Bharadwaj Deeps is";
            String[] sp = s.split(" ");
            for (int i = 0; i < sp.length; i++) {
                System.out.println(sp[i].charAt(0));
            }

    }
}
