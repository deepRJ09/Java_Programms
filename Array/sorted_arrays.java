public class sorted_arrays {
    public static void my_sort(int[]a){
        int i,j;
        for (i=0;i<=a.length-1;i++){
            for (j=i+1;j<a.length;j++)
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
        }
    }

    public static void main(String[] args) {
        int []a={2,5,6,8,9,7,4};
        my_sort(a);
        System.out.print("{ ");
        for (int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+",");
        }
        System.out.print(" etc }");
    }
}
