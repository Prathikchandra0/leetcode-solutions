class Solution {
    public int maximumDifference(int[] nums) {
        int count = 0;
        for(int i = 0 ; i< nums.length ; i++){
            for(int j =i+1 ; j< nums.length ; j++){
                if ( nums[i] < nums[j]){
                    int diff = nums[j] - nums[i];
                    if (count < diff){
                        count =diff;
                    }
                }

            }
        }
        return count == 0?-1 : count;
        
    }
}