public class Binary_search {
    public int Binarysearch(int[] Arr, int X, int low, int high){
        while (low<=high){
            int mid=(low+high)/2;
            if (Arr[mid]==X){
                return mid;
            }
            else if(X>Arr[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return X;
    }
    void display(int[] Arr, int X, int high) {
        System.out.println("value in position:  " + this.Binarysearch(Arr, X, 0, high));
    }

    public static void main(String[] args) {
        Binary_search binarySearch = new Binary_search();
        int[] arr = {2, 5, 6, 7, 80, 40, 98, 100};
        int input_find_value = 80;
        boolean b = false;
        boolean a = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            a = input_find_value == arr[i];
            if (input_find_value == arr[i]) {
                binarySearch.display(arr, input_find_value, arr.length - 1);
                break;
            }
        }
        if (b == a) {
            System.out.println("Input does not matched with array!");
        }
    }
}
