import java.util.LinkedList;

public class LinkedLisr_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.get(0)+list.get(2));
        System.out.println(list);
        list.addFirst(4);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.indexOf(10));

    }
}
