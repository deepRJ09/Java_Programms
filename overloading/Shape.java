import java.util.InputMismatchException;
import java.util.Scanner;
public class Shape {
    void area(double r){
        double ans=3.14*4*r;
        System.out.println("==========================================================================================");
        System.out.println("Area of circle is "+ans);
        System.out.println("==========================================================================================");
    }
    void area(int l ,int b){
        int ans=l*b;
        System.out.println("==========================================================================================");
        System.out.println("Area of Rectangle is "+ans);
        System.out.println("==========================================================================================");
    }
    void area(int s){
        int ans=s*s;
        System.out.println("==========================================================================================");
        System.out.println("Area of Square is "+ans);
        System.out.println("==========================================================================================");
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        String[] out = input.split(",");
        String a_1 = out[0] + "," + out[0] + "," + out[0];
        if (input.length() < a_1.length()) {
            try {
                int a = Integer.parseInt(out[0]);
                int b = Integer.parseInt(out[1]);
                shape.area(a, b);
            } catch (ArrayIndexOutOfBoundsException e) {
                int new_a = Integer.parseInt(input);
                shape.area(new_a);
            } catch (NumberFormatException e) {
                double new_b = Double.parseDouble(input);
                shape.area(new_b);
            }
        }
        else {
            System.out.println("==========================================================================================");
            System.out.println("wrong input.");
            System.out.println("==========================================================================================");
        }
    }

    }
