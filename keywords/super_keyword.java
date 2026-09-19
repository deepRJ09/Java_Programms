class parent_super{
    int x=20;
    int y=30;

}
class  child extends  parent_super{
    void display(int x, int y){
        System.out.println("Child class: "+x+y);
        System.out.println("parent-super class: "+(super.x+super.y));

    }
}
public class super_keyword {
    public static void main(String[] args) {
        child cd=new child();
        cd.display(2,4);
    }
}
