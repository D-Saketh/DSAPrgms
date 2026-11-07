class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, maxfreq = 0;
        for(int num: nums) {
            map.put(num, map.getOrDefault (num, 0) +1);
             maxfreq = Math.max(maxfreq, map.get(num));
        }

        for(int num: nums) {
            if(map.get(num) == maxfreq) {
                count++;
            }
        }
        return count;
    }
}