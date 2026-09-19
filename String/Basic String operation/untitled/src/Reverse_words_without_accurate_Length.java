public class Reverse_words_without_accurate_Length {
    public static String Reverse(String s){
        String a="";
        for (int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);

        }
        return a;
    }

    public static void main(String[] args) {
        String a="My Name Is Deepanshu Bharadwaj";
        String[]b=a.split(" ");
        String c="";
       for (int i=0;i<b.length;i++){
       c+=Reverse(b[i]+" ");

       }
        System.out.println(c);

    }
}
