import java.util.Scanner;
public class overload_bank {
    static void account(String name){
        System.out.println("Name: "+name);
    }
    static void account(String name,int account_number){
        System.out.println("Name: "+name);
        System.out.println("account number: "+account_number);
    }
    static void account(String name,int account_number, int bank_balance){
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+account_number);
        System.out.println("Bank Balance: "+bank_balance+"rs");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please put comma (,)between name and surname:-");
        System.out.println("=========================================================================================");
        System.out.print("Enter your account details: ");
       String input=sc.nextLine();
        System.out.println("=========================================================================================");
       String []Data=input.split(" ");
       if (Data.length==1){
account(Data[0].replaceAll(","," "));
       }
       else if (Data.length==2){
           int account_number=Integer.parseInt(Data[1]);
           account(Data[0].replaceAll(","," "),account_number);
       }
       else if(Data.length==3){
           int account_number=Integer.parseInt(Data[1]);
           int bank_balance=Integer.parseInt(Data[2]);
           account(Data[0].replaceAll(","," "),account_number,bank_balance);
       }
       else {
           System.out.println("Invalid Details");
       }
        System.out.println("=========================================================================================");
    }
}
