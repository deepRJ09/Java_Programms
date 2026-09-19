import java.util.Scanner;

public class dollar_to_inr {
    private double access=95.55 ;
    private double access_2=0.55;
    void manage(int a){
        if (a==1) {
            this.access_2 += a * 95;
            System.out.println("INR: " + this.access_2);
        }
        else {
            this.access*=a;
            System.out.println("INR: "+this.access);
        }
    }
    void manage(int a, int b){
        this.access*=(a+b);
        System.out.println("INR: "+this.access);
    }
   public  double provider(){
        return access;

   }
   public  double provider_2(){
        return access_2;
   }

    public static void main(String[] args) {
        try {
            dollar_to_inr l = new dollar_to_inr();
            Scanner cs = new Scanner(System.in);
            System.out.print("Enter the dollar $: ");
            String input = cs.nextLine();
            String[] process = input.split("[+]");
            if (1 == process.length) {
                System.out.println("======================================================================================");
                l.manage(Integer.parseInt(process[0]));
            } else if (2 == process.length) {
                System.out.println("======================================================================================");
                l.manage(Integer.parseInt(process[0]), Integer.parseInt(process[1]));
            } else {
                System.out.println("======================================================================================");
                System.out.println("Please enter less than 2 inputs with using (+) between them!");
            }
        } catch (Exception e) {
            System.out.println("Please enter integer only with less than 2 inputs with using (+) between them!");
        }
    }


    }
