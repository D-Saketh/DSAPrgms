class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            int count = 1;

            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/3 && !(result.contains(nums[i]))){
                result.add(nums[i]);
            }
        }
        return result;
    }
}

