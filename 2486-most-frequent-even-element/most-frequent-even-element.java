class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxfreq = 0;
        int ans = -1;
        for(int num: nums) {
            if(num %2 == 0) {
                map.put(num, map.getOrDefault(num, 0) +1);
                maxfreq = Math.max(maxfreq, map.get(num));
            }
        }

        for(int num: map.keySet()) {
            if(map.get(num) == maxfreq) {
                if(ans == -1 || num < ans) {
                    ans = num;
                }
            }
        }
        return ans;
    }
}