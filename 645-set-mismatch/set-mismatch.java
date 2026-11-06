class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        Arrays.sort(nums);

        for(int i=0; i<n-1; i++) {
            if(nums[i] == nums[i+1]) {
                ans[0] = nums[i];
                ans[1] = missing(nums, ans[0]);
                break;
            }
        }
            return ans;
    }

    public int missing(int nums[], int duplicate) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += nums[i];
        }
        int exp = n *(n+1)/2;
        return exp - (sum -duplicate);
    }
}