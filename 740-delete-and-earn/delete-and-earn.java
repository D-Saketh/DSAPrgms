class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int num: nums) {
            max = Math.max(max, num);
        }
        int points[] = new int[max+1];

        for(int num: nums) {
            points[num] += num;
        }

        int dp[] = new int[max+1];
        Arrays.fill(dp, -1);
        dp[0] = points[0];

        if(max >= 1) {
            dp[1] = Math.max(points[0], points[1]);
        }

        for(int i=2; i<=max; i++) {
                int take = points[i] + dp[i-2];
                int  nottake = dp[i-1];
        dp[i] =  Math.max(take, nottake);
        }
        return dp[max];
    }
}