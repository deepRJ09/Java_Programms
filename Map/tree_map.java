import java.util.TreeMap;
public class tree_map {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(101,"ABC");
       System.out.println(map.get(101));
        System.out.println(map.keySet());
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.getClass());
        System.out.println(map.containsKey(101));
        System.out.println(map.values());
        System.out.println(map);

         
    }
}
