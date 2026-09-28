package Strings;

public class CountVowels {
    public static int count(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String s = "Odysseyus";
        int count = count(s);
        System.out.print(count);
    }
}
