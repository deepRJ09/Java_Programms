public class firts_and_last_reverse {
    public static void main(String[] args) {
   String s="yM eamN ueepanshD jharadwaB";
   String []s2=s.split(" ");
   for (int i=0;i<s2.length;i++){
       int a=s2[i].length()-1;
       System.out.print(s2[i].substring(a)+s2[i].substring(1,a)+s2[i].charAt(0)+" ");
   }
    }
}
