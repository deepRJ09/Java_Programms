import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Deepanshu");
        map.put(2,"Deepanshu");
        map.put(3,"Deepanshu");
        map.put(4,"Deepanshu");
        map.put(5,"Deepanshu");
        map.put(6,"Deepanshu");
        map.put(7,"Deepanshu");
        map.put(8,"Deepanshu");
        map.put(9,"Deepanshu");
        map.put(10,"Deepanshu");
        map.put(11,"Deepanshu");
        System.out.println(map);
     for (int i= 2;i<=map.size();i--){
         map.remove(i);
     }
        System.out.println(map);
    }
}
