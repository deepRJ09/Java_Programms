import java.util.Arrays;

public class Second_largest_from_array {
   public static void deeps(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
            int []deeps ={25,96,9,55,16,8};

            deeps(deeps);

            System.out.println("Second Largest number is :"+deeps[deeps.length - 2]);
    }
}
