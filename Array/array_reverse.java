public class array_reverse {
    public static void main(String[] args) {
        int[]X={0,1,2,3,4};
        int []Y={X[4],X[3],X[2],X[1],X[0]};
        int C= Y.length-1;
        for (int i=0;i<=C;i++){
            System.out.print(" " + Y[i]);
        }
    }
}
