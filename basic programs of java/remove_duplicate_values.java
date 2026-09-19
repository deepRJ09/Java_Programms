public class remove_duplicate_values {
    public static  void value_1(int [] a){
        for (int i = 0; i< a.length-1; i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]> a[j]){
                    int temp= a[i];
                    a[i]= a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            int[] a = {2, 9, 4, 8, 4};
            int k;
            System.out.print("Input: [");
            for (k=0;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println("]\n=================================================");
            value_1(a);
            System.out.print("output: [");
            for (int i = 0; i < a.length; i++) {

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        a[i] = a[j];
                        break;
                    }
                    System.out.print(a[i] + " ");
                    break;
                }

            }
            System.out.println(a[a.length - 1]+" ]");
        } catch (Exception e) {
            System.out.println("==================================================");
        }
                }
            }


