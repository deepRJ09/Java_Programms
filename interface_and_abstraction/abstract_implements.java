abstract  class parent{
    abstract void study();
}
class child extends parent {
    @Override
    void study() {

        System.out.println("English");
    }
}
public class abstract_implements {
    public static void main(String[] args) {
        child sc=new child();
        sc.study();
    }
}
