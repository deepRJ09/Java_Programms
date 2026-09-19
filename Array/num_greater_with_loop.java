import java.util.Arrays;
public class num_greater_with_loop {
    public static void main(String[] args) {

            int[] x = {8,5,13,15};

            for(int i=0;i<x.length;i++){
                for(int j=i+1;j<x.length;j++){
                    if(x[i]>x[j]){   //i=8,j=5
                        int a=0;
                         a=x[i];
                        x[i]=x[j];
                        x[j]=a;

                    }
                }  System.out.print(x[i] + " ");
            }


        }
    }

