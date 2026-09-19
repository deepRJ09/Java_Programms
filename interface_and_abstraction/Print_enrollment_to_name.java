import java.util.Scanner;
interface _1{
    final String name="Deepanshu";
}
interface _2{
    final  int enrollment=233;
}
class imp implements _1,_2{
    void run(String id){
        if (id.equals(name)){
            int len=name.length();
            System.out.println("Your enrollment number is : 0501CS"+enrollment+"D0"+len);
        }
        else {
            System.out.println("You are not eligible "+id);
        }
    }
}
public class Print_enrollment_to_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String Name=sc.next();
        imp i= new imp();
        i.run(Name);
    }
}
