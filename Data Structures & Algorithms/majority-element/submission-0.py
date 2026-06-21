import random
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        while True:
            number = random.choice(nums)
            if nums.count(number) > n//2:
                return number
        