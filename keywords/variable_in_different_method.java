public class variable_in_different_method {
private int x=20;
public void user_age(){
    this.x+=5;
    System.out.println("is here-");
}
public void display_user(){
    System.out.println(this.x);
}
    public static void main(String[] args) {
        variable_in_different_method v=new variable_in_different_method();
        v.user_age();
        v.display_user();
    }
}
