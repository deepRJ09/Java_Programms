import java.util.Scanner;

abstract class  tv{
    abstract void on();
abstract void off();
}
class remote extends tv{
    void on(){
        System.out.println("Tv on");
    }


    void off() {
        System.out.println("Tv off");
    }
}
public class abstraction_1 {
    public static void main(String[] args) {
remote access=new remote();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter access (on/off): ");
        String a= sc.next();
if (a.equalsIgnoreCase("on")){
    access.on();
} else if (a.equalsIgnoreCase("off")) {
    access.off();
}
else {
    System.out.println("Please enter on/off.");
}
    }
}
