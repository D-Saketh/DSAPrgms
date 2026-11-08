class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }

        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0)/2;
        int o = map.getOrDefault('o', 0)/2;
        int n = map.getOrDefault('n', 0);

        int min = b;
        min = Math.min(min, a);
        min = Math.min(min, l);
        min = Math.min(min, o);
        min = Math.min(min, n);
        
        return min;
    }
}