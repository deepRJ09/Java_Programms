class first{
    static int a=20;
}
class middele extends  first{
    void first(){
        System.out.println(super.a);
    }
}
public class second extends first {

    public static void main(String[] args) {
        int a=10;
//        System.out.println(super.a);
    }
}
