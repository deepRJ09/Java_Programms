public class num_greater_than_smaller_than {
    public static void main(String[] args) {
        int []arr={8,5,3,13,4};
        boolean one= arr[0]<arr[1];
        boolean two= arr[0]<arr[2];
        boolean three= arr[0]<arr[3];
        boolean last=arr[0]<arr[4];
     if (one == true || two == true || three == true || last == true){
         System.out.println("the ans is : "+arr[0]+" and "+arr[3]);
     }
else {
         System.out.println("this is unreachable numbers");
     }
    }
}
