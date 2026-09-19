class  encapsuled{
    static int pin=2;
    public static int get(){
        return pin;
    }
    public static  void set(int a,int b){
     pin*=a+b;
    }
}
public class encapsulate {
    public static void main(String[] args) {
        encapsuled e=new encapsuled();
        e.set(2,3);
        System.out.println("This is a total: "+e.get());
    }

}

