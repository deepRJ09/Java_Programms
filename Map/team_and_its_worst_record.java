import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class team_and_its_worst_record {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the record which you want: ");
            String input = sc.next().replaceAll(" ","");
            String replace = input.replaceAll("[A-Za-z][^0-9]", "");
            int convert = Integer.parseInt(replace);
            map.put(49, "RCB");
            map.put(2, "CSK");
            map.put(18, "RCB");
            map.put(0, "PBKS");
            System.out.print("==========================================================================================\n");
            if (map.get(convert)==map.get(null)) {
                System.out.print("This record is not eligible");
            } else {
                System.out.print("Team: " + map.get(convert));
            }
            System.out.print("\n========================================================================================");
        }
        catch (Exception e){
            System.out.println("========================================================================================");
            System.out.println("please type any one or more digit with string.\nThese all under 2 words(1 & more digits with 2 -words).");
            System.out.println("========================================================================================");
            System.out.println("i hope you understand this.\n\t\t\t\t\t\t\tthank you!");
            System.out.println("========================================================================================");
        }
    }
    }
