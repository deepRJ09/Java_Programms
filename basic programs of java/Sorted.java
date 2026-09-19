public class Sorted {
    public static void Deep(int[]deeps){
        for(int i=0;i<=deeps.length-1;i++){
            for (int j=i+1;j<deeps.length;j++) {
                if (deeps[i] > deeps[j]) {
                    int temp = deeps[i];
                    deeps[i] = deeps[j];
                    deeps[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int []deeps={5,8,4,2};
        Deep(deeps);
        for (int i=0;i<=deeps.length-1;i++){
            System.out.println(deeps[i]);
        }

    }
}
