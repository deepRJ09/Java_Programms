public class invoke_constructor {
    int a;
    int b;
invoke_constructor(){
    System.out.print("world cup");
    System.out.print(" ");
}
invoke_constructor(int a,int b){
    this();
    this.a=a;
    this.b=b;
}
    public static void main(String[] args) {
        invoke_constructor i=new invoke_constructor(20,27);
        System.out.print(i.a+""+i.b);
    }
}
