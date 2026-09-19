public class method_chaining_with_this {
    private String method;
    private String overload;
    public method_chaining_with_this setMethod(String method){
        this.method=method;
        return this;
    }
    public method_chaining_with_this setOverload(String overload){
        this.overload=overload;
        return this;
    }
    public void display(){
        System.out.println(method+"/"+overload);
    }
    public static void main(String[] args) {
        new method_chaining_with_this()
                .setMethod("Hello")
                .setOverload("World")
                .display();
    }
}
