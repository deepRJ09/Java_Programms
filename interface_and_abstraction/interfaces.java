
interface  hello{
    final int  x=8;
    void hello_world();
}
class hp implements hello{

    public void hello_world(){
       int c=x*5;
        System.out.println(c);
    }
}
public class interfaces {
    public static void main(String[] args) {
        hp h=new hp();
        h.hello_world();
    }
}
