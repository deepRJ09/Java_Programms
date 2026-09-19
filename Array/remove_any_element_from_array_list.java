import java.util.ArrayList;
public class remove_any_element_from_array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(122);
        list.add(121);
        list.add(128);
        list.add(129);
        list.add(102);
        list.remove(2);
        list.set(2,109);
        System.out.println(list.get(2));
        System.out.println(list);
    }
}
