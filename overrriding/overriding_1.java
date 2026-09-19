class override{
    public static void overriden(int a){
        a+=2;
        System.out.println(a);
    }
}
public class overriding_1 extends override {
    public void overriden(int a,int b){
        int c=a+b*2;
        System.out.println(c);
    }
    public static void main(String[] args) {

      overriding_1 o=new overriding_1();
      o.overriden(1,2);
    }
}
