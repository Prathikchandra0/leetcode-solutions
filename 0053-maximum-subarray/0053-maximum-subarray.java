class Solution {
    public int maxSubArray(int[] nums) {
        int add = nums[0];
        int output = nums[0];

        for(int i=1 ;i<nums.length ; i++){
            add = Math.max(nums[i], add + nums[i]);
            output = Math.max(add , output);
        }
        return output;
        
    }
}