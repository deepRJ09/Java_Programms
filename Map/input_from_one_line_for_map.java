import java.util.*;
import java.util.Scanner;
public class input_from_one_line_for_map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Keys: ");
       Map<Integer,String> map=new LinkedHashMap<>(){{put(sc.nextInt(), sc.next());}};
       map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        System.out.println("=========================================================================================");
        System.out.println("Map: "+map);
        System.out.println("=========================================================================================");
        System.out.print("Enter the key: ");
        int num=sc.nextInt();
        System.out.println("=========================================================================================");
        System.out.print("This is the value of key: "+map.get(num)+"\n");
        System.out.println("=========================================================================================");
    }
}
