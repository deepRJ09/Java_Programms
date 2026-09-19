class overriden{
    public void overriden(){
        System.out.println("1");
    }
}
public class override extends overriden{
   public  void overriden(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        override o=new override();
        o.overriden();
    }
}
