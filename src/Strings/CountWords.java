package Strings;

public class CountWords {
    public static int count(String s){
        int count = 0;
            s = s.trim();
            String words[] = s.split(" ");
            return words.length;
    }
    public static void main(String args[]){
        String s = "I'm always angry";
        int count = count(s);
        System.out.print(count);
    }
}

