import java.util.HashMap;
import java.util.Map;
public class easy_repeat_words {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String s = "deepanshu bharadwaj deepanshu";
        String[] s2 = s.split(" ");
        for (String s3 : s2) {
            if (map.containsKey(s3)) {
                map.put(s3, String.valueOf(map.get(s3).length()+1));
            } else {
                map.put(s3, String.valueOf(1));
            }
        }
        System.out.println(map);
    }
    }