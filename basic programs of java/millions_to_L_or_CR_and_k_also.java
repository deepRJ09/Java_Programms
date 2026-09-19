import java.util.Scanner;

public class millions_to_L_or_CR_and_k_also {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        double millions= sc.nextDouble();
        double billions=millions/1000;
        System.out.println("===================================================================");
        if (millions>=1000){
            System.out.println("you enter : "+billions+"B\n");
        }
        else {
        System.out.println("you enter : "+millions+"M\n");
        }
        System.out.println("===================================================================");
            if (millions>=10){
                double cr=millions*0.1;
                System.out.println("Which is : "+cr+"CR");
            }
            else  if (millions>=1){
                double lak=millions*10;
                System.out.println("Which is : "+lak+"L");
            }
            else {
                double K=millions*1000;
                System.out.println("Which is : "+K+"K");
            }
        }

    }

