import java.lang.Math;
import java.util.Scanner;
public class check_armstrong_numbers {
    static  void armstrong_numbers(int start, int end){
        for (int num=start;num<=end;num++){
            int original=num;
            int temp=num;
            int digits=0;
            while(temp!=0){
                digits++;
                temp/=10;
            }
            temp=num;
            int sum=0;
            while (temp!=0){
                int digit=temp%10;
                sum+=(int)Math.pow(digit,digits);
                temp/=10;
            }
            if(sum==original){
                System.out.print(original+" ");
            }
        }
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        int start=sc.nextInt();
        System.out.print("Enter the ending value: ");
        int end= sc.nextInt();
        System.out.println("============================================");
        System.out.print("Armstrong number: [ ");
        armstrong_numbers(start,end);
        System.out.print(" ].");


    }
}
