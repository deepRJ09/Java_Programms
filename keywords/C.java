class A{
static  int a=20;
}
class B{
    static int a;
}
public class C extends A{
    static int a=10;
    public static void main(String[] args) {
        System.out.println(a);

    }
}
