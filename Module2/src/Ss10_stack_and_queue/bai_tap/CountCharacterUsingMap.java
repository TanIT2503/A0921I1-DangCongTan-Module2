import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CountCharacterUsingMap {
     public static void countCharacterUsingMap(String str){
        Map<Character, Integer> map=new TreeMap<Character, Integer>();

        str.toLowerCase();
        char[] strArr=str.toCharArray();

        for (char c : strArr){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String inputString=scanner.nextLine();
        countCharacterUsingMap(inputString);
    }
}
