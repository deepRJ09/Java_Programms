public class repeated_greates_num {
    public static void main(String[] args) {
   String s="145897456891235";
   String []s1=s.split("");
   int []a=new int[s1.length];
   for (int i=0;i<s.length();i++){
       a[i]=Integer.parseInt(s1[i]);
   }
   for (int i=0;i<s.length();i++){
       for (int j=0;j<s.length();j++){
           if (a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            a[i]++;
           }
           if (a[i]<a[j]){
               int temp=a[j];
               a[j]=a[i];
               a[i]=temp;
               a[j]--;
           }

       }
       System.out.print(a[i]);
   }

    }
}
