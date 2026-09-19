import java.util.Scanner;

interface resident_evil_9{
    abstract int code(int leon_s_kenedy , int grace_achorfost);
}
abstract  class final_boss_fight implements   resident_evil_9{
    public int code(int leon_s_kenedy, int grace_achorfost){
        return leon_s_kenedy*grace_achorfost;
    }
}
class winner extends  final_boss_fight{ }
public class Play_now {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decision for eplis(1-for release eplis/2-for destroy it): ");
        int i= sc.nextInt();
        System.out.println("==================================================================================================================================================================");
        winner w=new winner();
      final   int a=1;
       final  int b=1;
        if (w.code(a ,b)==i){
            System.out.println("grace input the password is hope , its correct , eplis released, its antiviral ,leon revived, victor killed zeno,leon killed victor,we win the resident evil game");
        }
        else {
            System.out.println("grace input password is destruction , its wrong, eplis destroyed,zeno killed leon,leon died ,we lost resident evil game");
        }
        System.out.println("==================================================================================================================================================================");

    }
}
