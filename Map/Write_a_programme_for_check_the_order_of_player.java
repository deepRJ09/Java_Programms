import java.util.HashMap;
import java.util.Scanner;
public class Write_a_programme_for_check_the_order_of_player {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rohit Sharma");
        map.put(2, "Shubhman Gill");
        map.put(3, "Virat Kohil");
        map.put(4, "Shreyash Iyer");
        map.put(5, "KL Rahul");
        map.put(6, "Hardik pandya");
        map.put(7, "Ravindra Jadeja");
        map.put(8, "Bhuvneswar kumar");
        map.put(9, "Moh. Siraj");
        map.put(10, "Jasprit Bumrah");
        map.put(11, "Kuldeep Yadav");
        System.out.print("Enter the players order for who played from which number: ");
        int order=sc.nextInt();
        System.out.println("============================================================================================================================================================================================================================================================================================================================================================================");
        for (int i = order-1; i <= map.size()+1; i--) {
            map.remove(i);
        }
        System.out.println("players : " + map);
        System.out.println("============================================================================================================================================================================================================================================================================================================================================================================");

    }
}
