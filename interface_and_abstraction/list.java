interface list_1 {
    abstract  String s();


    }
    abstract class  list_2 implements list_1{
    //list_2 s = new list_2() ;
    abstract  String test();
    public String s(){
        System.out.println("Hello world");
        return "2";
    }
    class  list_3 extends list_2{
        @Override
        String test() {
            return "";
        }

        @Override
        public String s() {
            return super.s();
        }
    }
    }
public  class list {
    public static void main(String[] args) {
    }
}
