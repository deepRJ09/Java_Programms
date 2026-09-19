public class Quick_sort {

    public void QuickSort(int []Arr){
for (int i=0;i<Arr.length;i++){
for (int j = i+1; j< Arr.length; j++){
    int temp;
    if (Arr[i]>Arr[j]){
        temp=Arr[i];
        Arr[i]=Arr[j];
        Arr[j]=temp;

    }
}
        }
    }

    public static void main(String[] args) {
        Quick_sort qs=new Quick_sort();
        int []arr={4,1,0,2};
        qs.QuickSort(arr);
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}
