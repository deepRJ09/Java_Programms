import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class repeated_word {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>(); // empty map
        String s = "tree shade is 111166666 very loongooooooo";
        for(int i=0;i<s.length();i++){
                  if(map.containsKey(s.charAt(i))){
                      map.put(s.charAt(i),map.get(s.charAt(i))+1);
                  }else {
                      map.put(s.charAt(i),1);
                  }
        }
        System.out.println(map);
    }
          }




