class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0, farthest = 0;
        int left = 0, right = 0;

        while(right < n-1) {
            for(int i=left; i<=right; i++) {
                farthest = Math.max(farthest, i+nums[i]);
            }
            jumps++;
            left = right+1;
            right = farthest;
        }
        return jumps;
    }
}