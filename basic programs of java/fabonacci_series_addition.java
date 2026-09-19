public class fabonacci_series_addition {
    int a=-1,b=1,n=10,sum=a+b;
    fabonacci_series_addition(int m){
        n=m;
    }
    void series(){
        for (int i=0;i<=n;i++){
          int   c=a+b;
          sum+=c;
            a=b;
            b=c;

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
       fabonacci_series_addition f=new fabonacci_series_addition(7);
        f.series();

    }
}
