public class input_int_to_array {
    public static void main(String[] args) {
        int  a=58697;
     String s=String.valueOf(a);
String[]arr_1=s.split("");
        int []arr_2=new int[a];
        System.out.print("[ ");
        for (int i=0;i<arr_1.length;i++){
            arr_2[i]=Integer.parseInt(arr_1[i]);
        }

        for (int i=0;i<arr_1.length;i++){
            arr_2[i]=arr_2[i]*10000;
            System.out.print(arr_2[i]+",");


        }
        System.out.println(" ended ]");
        }
    }

