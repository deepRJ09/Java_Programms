import java.util.Scanner;

public class revers_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int num_2=num;
        int new_num=0;
        while(num>0){
            new_num=num%10;
            num=num/10;
            System.out.print(new_num);

        }
        System.out.println(" is a reverse number of "+num_2);
    }
}
