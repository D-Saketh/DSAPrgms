class Solution {
    public int rob(int[] money) {
        int n = money.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = money[0];

        int take = 0, nottake = 0;
        for(int i=1; i<n; i++) {
            if(i == 1) {
                take = money[i];
            }
            if(i > 1) {
                take = money[i] + dp[i-2];
            }
            nottake = dp[i-1];
            dp[i] = Math.max(take, nottake);
        }
            return dp[n-1];
    }
}