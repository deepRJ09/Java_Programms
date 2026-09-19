public class first_and_last_int {
    public static void main(String[] args) {
        int input=123456;
        int first=input;
        int last=input%10;
        while(first>=10){
            first/=10;
        }
        int mid=(input%100000)/10;
        int output=last*100000+mid*10+first;
        System.out.println(output);
    }
}
