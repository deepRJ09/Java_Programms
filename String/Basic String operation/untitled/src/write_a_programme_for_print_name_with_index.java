import java.util.Scanner;

public class write_a_programme_for_print_name_with_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Name :");
        String a= sc.next();
try {
    for (int i = 0; i <= a.length(); i++) {
        System.out.println(a.charAt(i) + "=" + i);
    }
} catch (Exception e) {
    System.out.println("==============================");
}
    }
}
