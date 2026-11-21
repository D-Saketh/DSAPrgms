class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];

        int max = nums[0];
        for(int i=1; i<n; i++) {
            if(i > max) {
                return false;
            } else {
                max = Math.max(max, i + nums[i]);
            }
        }
        return true;
    }
}