public class overload {
   public int  overload(int a){
       System.out.println(a*2);
       return a;
   }
    public  int  overload(int a,int b){
       int c=a*b*2;
        System.out.println(c);
        return c ;
    }
    public static void main(String[] args) {
        overload o=new overload();
        o.overload(12,2);
    }
}
