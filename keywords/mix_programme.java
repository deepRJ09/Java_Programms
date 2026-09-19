import java.util.Scanner;
abstract class _abstracts{
    abstract  void hello();
}
class  abs extends  _abstracts{
    void hello(){
        System.out.println("The process is start!");
        System.out.println("============================================================================================");
    }
    final int x=100;
}
class abstract_2 extends abs{
    void display(int a){
        System.out.println("The process: "+(a+(super.x)));
    }
}
class  last extends abstract_2{
    int x=20;
    int b=30;
    void displayed(int a) {
        System.out.println("The analyser for process: "+(this.x+this.b)*a);
        System.out.println("======================================================================================");
        super.display(a);
    }
}
public class mix_programme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the process number for analysing : ");
        int x= sc.nextInt();
        System.out.println("==================================================================================");
        last c= new last();
        c.displayed(x);
        c.hello();
    }
}
