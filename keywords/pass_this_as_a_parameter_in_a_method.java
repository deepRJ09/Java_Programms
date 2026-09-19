class passed{
    void passing( pass_this_as_a_parameter_in_a_method away){
        System.out.println("Pass: "+away.string);
    }
}
public class pass_this_as_a_parameter_in_a_method {
String string;
    public void apple(String string){
        this.string=string;
    }
    public void display(){
        passed pass=new passed();
        pass.passing(this);

    }

    public static void main(String[] args) {
   pass_this_as_a_parameter_in_a_method pass=new pass_this_as_a_parameter_in_a_method();
   pass.apple("ipl");
   pass.display();

    }

}
