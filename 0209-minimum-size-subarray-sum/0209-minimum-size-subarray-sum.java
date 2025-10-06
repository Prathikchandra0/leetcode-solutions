class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int mnLen =Integer.MAX_VALUE;
        int cursum =0;
        


        for(int right =0 ; right <nums.length ; right++){
            cursum += nums[right];
            while(cursum >= target){
                int curLen = right-left+1;
                mnLen = Math.min(mnLen , curLen);
                cursum -= nums[left];
                left++;
            }
            
            
        }
        return (mnLen == Integer.MAX_VALUE)? 0 : mnLen;
        
    }
}