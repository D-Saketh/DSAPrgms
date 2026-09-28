package Strings;

public class CountCases {
        public static void countCases(String s){
            int LowerCount = 0, UpperCount = 0;
            for(int i=0; i<s.length(); i++){
                if(Character.isLowerCase(s.charAt(i))){
                        LowerCount++;
                }else if(Character.isUpperCase(s.charAt(i))){
                        UpperCount++;
                }else{
                    continue;
                }
            }
            System.out.println("UpperCount is : "+LowerCount);
            System.out.print("LowerCount is : "+UpperCount);
        }

    public static void main(String args[]){
        String s = "OdySseyus";
        countCases(s);

    }
}
