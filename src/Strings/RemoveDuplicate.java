package Strings;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String args[]){
        String s = "Programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        System.out.println(set);
    }
}


