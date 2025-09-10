class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        
        for(int i =0 ;i<nums.length ;i++){
            nums[i]=nums[left]*nums[left];
            left++;
           
            
        }
        Arrays.sort(nums);
        return nums;
        
        
    }
}