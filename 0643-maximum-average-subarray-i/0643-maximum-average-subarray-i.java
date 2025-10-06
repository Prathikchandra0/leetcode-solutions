class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        double curSum = 0;

        for(int i =0; i <k ; i++){
            curSum += nums[i];
        }
        double mxSum = curSum;

        for(int right=k ;right < nums.length ; right++){
            curSum += nums[right];
            curSum -=nums[left];
            left++;
            mxSum = Math.max(mxSum , curSum);
        }
        return mxSum/k;
        
    }
}