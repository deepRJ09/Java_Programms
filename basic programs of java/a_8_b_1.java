public class a_8_b_1 {
    public int funn(int a,int b){
        int c=b-1;
        int d=a-1;
        if (a>b && a>0){
            return a+b+funn(c,d);
        }
        return a+b;
    }
    public void display(int a,int b){
        System.out.println(this.funn(a,b));
    }

    public static void main(String[] args) {
        a_8_b_1 a=new a_8_b_1();
        a.display(8,1);
    }
}
