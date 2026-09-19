class abc{
    static int pin=2;

    public static int getPin() {
        return pin;
    }

    public static void setPin(int pin) {
        abc.pin = pin;
    }
    //public static int a() {
//    int a = pin*2;
//    return a;
//}
//public void  b(){
//    System.out.println("this is pin: "+a());
//}

}
public class encapsulation {
    public static void main(String[] args) {
        abc p=new abc();
       p.getPin();

    }
}
