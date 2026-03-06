class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:

        nums.sort()
        res =nums[0]+nums[1]+nums[2]
        n = len(nums)

        for i in range (n):

            left=i+1
            right = n-1

            while left < right:
                total = nums[i]+nums[left]+nums[right]

                if abs(total - target)< abs(res - target):
                    res = total
                if total < target:
                    left +=1
                else:
                    right -=1
                
                
        return res
        