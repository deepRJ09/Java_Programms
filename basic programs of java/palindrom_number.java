import java.util.Scanner;

public class palindrom_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int reverse=0;
        int temp=num;
        while (temp>0){
            int reminder=temp%10;
            reverse=reverse*10+reminder;
            temp=temp/10;
        }
      boolean a=reverse== num;
        if (a){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("its not a palindrome");
        }

    }
}
