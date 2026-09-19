public class array_addition_target {
    public static void main(String[] args) {
        int []array={5,12,7,10,8,9};
        int target=15;
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++) {
                if ((array[i] + array[j] == target)) {
                    System.out.println(array[i] + " and " + array[j]);
                }
            }
        }
    }
}
