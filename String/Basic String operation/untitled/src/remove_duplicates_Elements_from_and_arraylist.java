import java.util.ArrayList;
public class remove_duplicates_Elements_from_and_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(19);
        list.add(15);
        list.add(10);
        list.add(1);
        list.add(10);
        list.add(10);
        System.out.println("input: "+list);
        for (int i=0;i<list.size();i++){
            int count=0;
            for (int j=0;j<list.size();j++){
                if (list.get(i)==list.get(j)){
                    count++;
                }
            }
            if (count>1){
                int value=list.get(i);
                for (int j=0;j<list.size();j++) {
                    if (list.get(j) == value) {
                        list.remove(j);
                        j--;
                    }
                }

                i--;
        }


    }
        System.out.println("output: "+list);
}
}
