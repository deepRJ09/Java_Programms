import java.util.Scanner;

abstract class years {
    final int x=40;
    int y=10;
    int b=45;
}
class years_backend_working extends years {
    void display(int y, int b){
        this.y+=y;
        this.b+=b;
        System.out.print("year: ");
        System.out.println(y+b*x);
    }
}
public class print_year_by_numbering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year number: ");
        int user_input= sc.nextInt();
        years_backend_working a=new years_backend_working();
        a.display(user_input,50);
    }
}
