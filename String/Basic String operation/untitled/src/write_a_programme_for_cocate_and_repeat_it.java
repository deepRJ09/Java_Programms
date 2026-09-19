import java.util.Scanner;

public class write_a_programme_for_cocate_and_repeat_it {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First String: ");
        String a= sc.next();
        System.out.print("Enter The Second String : ");
        String b= sc.next();
        String c=a.concat(" "+b+" ");
        System.out.println(c.repeat(5));

    }
}
