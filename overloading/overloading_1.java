public class overloading_1 {
    public static void overload(int a){

        a*=2;
        System.out.println(a);
    }
    public static void overload(float a){
        a+=2;
        System.out.println(a);
    }
    public static void main(String[] args) {
        overload(2f);
    }
}
