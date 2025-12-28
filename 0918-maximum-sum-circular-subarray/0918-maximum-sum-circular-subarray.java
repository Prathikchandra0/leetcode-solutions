class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int totalsum = nums[0];
        int currsum =nums[0];
        int globalmax =nums[0];

        int minsum = nums[0];
        int globalmin = nums[0];

        for(int i =1 ;i<nums.length ; i++){
            int num = nums[i];
            totalsum += num;

            currsum =Math.max(num , currsum + num);
            globalmax = Math.max(globalmax , currsum);

            minsum = Math.min(num , minsum +num);
            globalmin =Math.min(minsum , globalmin);


        }

        if(globalmax < 0){
            return globalmax;

        }
        return Math.max(globalmax , totalsum - globalmin);
    }
}