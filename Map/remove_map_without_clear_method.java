import java.util.HashMap;

public class remove_map_without_clear_method {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Deepanshu");
        map.put(2, "Deepanshu");
        map.put(3, "Deepanshu");
        map.put(4, "Deepanshu");
        map.put(5, "Deepanshu");
        map.put(6, "Deepanshu");
        map.put(7, "Deepanshu");
        map.put(8, "Deepanshu");
        map.put(9, "Deepanshu");
        map.put(10, "Deepanshu");
        map.put(11, "Deepanshu");
        System.out.println("Input of Map:\n" + map);
        System.out.println("=========================================================");
        for (int i = map.size(); i <= map.size(); i--) {
            map.remove(i);
        }
        System.out.println("Output of Map: " + map);
        System.out.println("=========================================================");
        boolean map_isEmpty = map.isEmpty();
        System.out.print("Check Map is Empty or not : ");
        if (map_isEmpty) {
            System.out.println("Yes, is empty");
        }
        else {
            System.out.println("No, is not empty");
        }
    }
}
