public class largest_number_with_array {
 public    static void deeps(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
            int []Deeps ={105,26,25,24,9,55,6,8};
            deeps(Deeps);
            System.out.println("largest number is : "+Deeps[Deeps.length - 1]);
    }
}
