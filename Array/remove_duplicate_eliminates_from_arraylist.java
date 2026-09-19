import java.util.ArrayList;
import java.util.Collections;
public class remove_duplicate_eliminates_from_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
list.add(15);
list.add(6);
list.add(6);
list.add(6);
list.add(8);
list.add(9);
list.add(5);
        System.out.println("input: "+list);
        System.out.println("======================================");
        Collections.sort(list);
for (int i=0;i<list.size();i++) {
    int count=0;
    for (int j = 0; j < list.size(); j++) {
        if (list.get(i)==list.get(j)) {
            count++;
        }
    }
    if (count>1){
        int value=list.get(i);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == value) {
                list.remove(j);
                j--;
            }
        }

        i--;
    }
}
        System.out.println("output: "+list);
        System.out.println("======================================");

    }
}




