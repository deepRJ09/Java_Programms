public class reversint {
    public static void main(String[] args) {
        reversint r = new reversint();
        int a = 1234;
        int b = 0;
        while (a!=0){
            int c=a%10;
            b=b*10+c;
              a=a/10;
        }
        System.out.println(b);
    }
}