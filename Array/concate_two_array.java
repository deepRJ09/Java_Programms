import java.util.Arrays;
public class concate_two_array {
    public static void main(String[] args) {
int []array_1={1,2,3,4};
int[]array_2={5,6,8};
int length=array_1.length+array_2.length;
int[]array_3=new int[length];
int plus=0;
for (int a:array_1){
array_3[plus]=a;
plus++;
}
for (int a:array_2){
    array_3[plus]=a;
    plus++;
}
        System.out.println(Arrays.toString(array_3));
    }
}
