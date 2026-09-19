class abcs {
    void method(){
        System.out.print("hello");
        System.out.print(" ");
    }
}
class abcs_2 extends  abcs{
    void method_2(){
        System.out.print("world");

    }
}
class abcs_3 extends  abcs_2{
    void method_3(){
        this.method();
        this.method_2();
    }
}
public class this_keyword_runs_as_method {
    public static void main(String[] args) {
        abcs_3 ab=new abcs_3();
        ab.method_3();
    }
}
