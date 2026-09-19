import java.util.Scanner;
public class encryption_decryption {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the decrypted data: ");
        String s= sc.next();
        int[] arr=new int[Integer.parseInt(s)];
        System.out.print("Encrypted: ");
        for (int i=0;i<s.length();i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n==========================================================================================");
        System.out.print("Enter encrypted data: ");
        String s1=sc.next();
        int[] arr2=new int[Integer.parseInt(s1)];
        String s2=s;
        System.out.println("==========================================================================================");
        System.out.println("Decrypted: "+s2);
    }
}
