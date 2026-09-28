package Strings;

import java.util.HashMap;

public class Freq {
    public static void main(String args[]){
        String s = "Bring me Thanos";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }
            System.out.println(map);

    }
}
