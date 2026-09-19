public class string_greate_small {
    public static  void my_sort(int[]my_array){
        int num=my_array.length;
        boolean is_it_sorted;
        for (int i=0;i<num-1;i++){
         is_it_sorted=false;
         for (int j=0;j<num-1-i;j++){
             if (my_array[j]>my_array[j+1]){
                 int temp=my_array[j];
                 my_array[j]=my_array[j+1];
                 my_array[j+1]=temp;
                 is_it_sorted =true;
             }
         }
         if (!is_it_sorted){
             break;
         }
        }
    }
    public static void main(String[] args) {
    String s="574";
        System.out.println("The input: "+s);
    String p=s.replaceAll(" ","");
     String []s1=p.split("");
        int[] a1 = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            a1[i] = Integer.parseInt(s1[i]);
        }
        my_sort(a1);
        String []a2= new String[a1.length];
        System.out.println("=================================");
        System.out.print("The output:");
      for (int j=0;j<a1.length;j++){
          a2[j]= String.valueOf(a1[j]);
          System.out.print(a2[j]);
      }
        System.out.println();
        System.out.println("=================================");
   }



    }


