class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left =0 ;
        int mxLen =0;
        long cnt =0;
        long curSum =0;

        for(int right =0 ; right< nums.length ; right++){
            curSum += nums[right];
            while(curSum * (right -left +1) >= k){
                curSum -= nums[left];
                left++;

            }
            cnt += right -left +1;

        }
        return cnt;
        
    }
}