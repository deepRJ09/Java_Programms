import java.util.Scanner;

public class perimeter_of_rectangle {
  static  int Length_x_Breath(int length,int breath){
        return 2*(length+breath);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of length: ");
        int length=sc.nextInt();
        System.out.print("===================================" +
                "\nEnter the value of breath: ");
        int breath= sc.nextInt();
        int perimeter_of_rectangle=Length_x_Breath(length,breath);
        System.out.println("===================================" +
                "\nPerimeter of rectangle is: "+perimeter_of_rectangle);
    }
}
