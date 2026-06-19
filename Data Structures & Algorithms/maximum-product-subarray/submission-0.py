class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        result = nums[0]
        curMax,curMin = 1,1

        for num in nums:
            tmp = curMax*num
            tmp2 = curMin*num
            curMax = max(tmp,tmp2,num)
            curMin = min(tmp,tmp2,num)
            result = max(result,curMax)
        return result
        