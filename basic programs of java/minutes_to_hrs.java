import java.util.Scanner;

public class minutes_to_hrs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the minutes: ");
        int minutes= sc.nextInt();
        int convert=minutes/60;
        System.out.println("============================================================");
        System.out.println(minutes+"min is "+convert+"hrs.");
    }
}
