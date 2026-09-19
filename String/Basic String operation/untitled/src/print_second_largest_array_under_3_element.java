import java.util.Arrays;

public class print_second_largest_array_under_3_element {
    public static void main(String[] args) {
        System.out.println("print ");
        System.out.println("===========================================================================================");
    int []arr={2,5,6};
        System.out.println(Arrays.toString(arr));
    if (arr[0]>arr[1] && arr[0]<arr[2]){
        System.out.println(arr[0]);
    }
    else if (arr[1]>arr[0] && arr[1]<arr[2]){
        System.out.println(arr[1]);
    }
    else {
        System.out.println(arr[3]);
    }
    }
}
