public class Static_members_using_this {
    static  int x=200;
    int getX=Static_members_using_this.x;

    public void display(int x){
        this.getX=x;
        Static_members_using_this.x*=this.getX();
    }

    private int getX() {

   return getX;
    }

    public static void main(String[] args) {
        Static_members_using_this s=new Static_members_using_this();
        s.display(1);
        System.out.println(Static_members_using_this.x);
    }
}
