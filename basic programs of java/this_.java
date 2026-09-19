import java.util.Scanner;
public class this_ {
    int hp=20;
    public void hello(int a){
        this.hp*=a;
    }
    public void display(){
        this.hello(2*4);
    }
    public void output_display(){
        this.display();
        System.out.println("output: "+this.hp);
    }
    public static void main(String[] args) {
        this_ t=new this_();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input: ");
        int input= sc.nextInt();
        t.hello(2*input);
        t.output_display();
    }
}
