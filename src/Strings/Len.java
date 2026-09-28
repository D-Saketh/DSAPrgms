package Strings;

public class Len {
    public static int len(String s){
        char arr[] = s.toCharArray();

        int count = 0;
        for(char ch: arr){
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        String s = "I'm Batman";
        int count = len(s);
        System.out.print(count);
    }
}
