package Strings;

public class RemoveSpaces {
    public static void main(String args[]){
        String s = " The Odysseyus ";
        s = s.replaceAll(" ", "");
        System.out.print(s);
    }
}
