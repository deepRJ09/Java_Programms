public class remove_zero_from_given_string {
    public static void main(String[] args) {
String s="1001001001";
String s1="";
for (int i=0;i<s.length();i++){
    int count=0;
    if (s.charAt(i)=='1'){
        count++;
    }
    if (count==1){
        s1=s1+s.charAt(i);
    }
}
        System.out.println(s1);
    }
}
