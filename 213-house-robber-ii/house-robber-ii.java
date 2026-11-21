class Solution {
    public int Robber(int[] money) {
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

    public int rob(int money[]) {
        int n = money.length;
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return money[0];
        }
        int temp1[] = new int[n-1];
        int temp2[] = new int[n-1];

        for(int i=0; i<n; i++) {
            if(i != n-1) {
                temp1[i] = money[i];
            }
            if(i != 0) {
                temp2[i-1] = money[i];
            }
        }
            int ans1 = Robber(temp1);
            int ans2 = Robber(temp2);
        
        return Math.max(ans1, ans2);
    }
}