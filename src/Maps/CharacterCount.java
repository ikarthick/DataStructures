package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(ch[i])){
                int temp = map.get(ch[i]) +1;
                map.put(ch[i],temp);
            }
            else
            map.put(ch[i],1);

        }
        System.out.println(map);
    }
}
