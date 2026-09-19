import java.util.Scanner;
class final_keywords{
    final  int word=100;
}
class  semi extends final_keywords{
    void display(int x){
        int c=x*word;
        System.out.println(c);
    }
}
public class final_keyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the int: ");
        int x= sc.nextInt();
        semi s=new semi();
        s.display(x);
    }
}
