public class program_1 {
    public static void main(String[] args) {
        int a=12478;
        int b=0;
        while(a!=0){
            int r;
            r=a%10;
            b=b*10+r;
            a=a/10;

        }
        System.out.println(b);

    }
}
