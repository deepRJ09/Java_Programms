import java.util.HashMap;
import java.util.Scanner;
public class Check_which_player_in_which_number {
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
        System.out.print("Enter the playing 11 number: ");
        int number=sc.nextInt();
        System.out.println("================================================================================================");
        System.out.println(" Player name: "+map.get(number));
    }
}
