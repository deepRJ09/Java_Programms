import java.util.Scanner;

public class Add_two_binary_string {
    static  String addBinaryString(String x,String y){
        int num_1=Integer.parseInt(x,2);
        int num_2=Integer.parseInt(y,2);
        int num_3=num_1+num_2;
        return Integer.toBinaryString(num_3);
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String X:");
            String x = sc.next();
            System.out.println("=========================");
            System.out.print("Enter the String Y: ");
            String y = sc.next();
            System.out.println("=========================");
            System.out.println("X+Y=" + addBinaryString(x, y));
            System.out.println("=========================");
        }
        catch (Exception e){
            System.out.println("Sorry! its invalid! ");
            System.out.println("================================================");
            System.out.println("Please enter input in binary format like(1011)!");
            System.out.println("================================================");
        }
    }
}
