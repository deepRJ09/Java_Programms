public class killometer_milimeter {
    int a=4;
    public void killo(int a  ){
        this.a*=a;
    }
    public void killo(double a){
this.milli(a*5);
    }
    public  void milli(int a){
this.killo(a*12);
    }
    public void milli(double a){
this.milli(2*5);
    }
    public void display(){
        System.out.println("Average of car: "+this.a);
    }

    public static void main(String[] args) {
killometer_milimeter km=new killometer_milimeter();
km.milli(5.5);
km.killo(4.2);
km.display();
    }
}
