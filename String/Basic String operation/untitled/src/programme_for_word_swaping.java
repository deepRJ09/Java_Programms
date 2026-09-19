import java.util.Scanner;

public class programme_for_word_swaping {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The String a:");
            String a = sc.next();
            System.out.print("Enter The String b: ");
            String b = sc.next();
            String s = a + " " + b;
            String[] c = a.split("");
            String[] d = b.split("");
            System.out.print("Enter The index:  ");
            int i = sc.nextInt();

            c[i] = d[i];


            for (i = 0; i <= s.length(); i++) {
                d[i] = c[i];

                System.out.print(d[i]);

            }

            System.out.println();
        } catch (Exception e) {
            System.out.println("The Index is not Eligible");
            System.out.println();
            System.out.println("====================================================");
        }
    }

}
