abstract class abstract_keywords{
    abstract void display();
}
class  children extends abstract_keywords {
    @Override
    void display() {
        System.out.println("Hello word");
    }
}
public class abstract_keyword {
    public static void main(String[] args) {
        children cd=new children();
        cd.display();
    }
}
