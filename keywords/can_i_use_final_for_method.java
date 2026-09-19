class finals{
    final void method(){
        int a=20;
        int b=30;
        System.out.println(a+b);
    }
    void display(){
        this.method();
    }
}
public class can_i_use_final_for_method {
    public static void main(String[] args) {
        finals f=new finals();
        f.display();
    }

}
