class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        maxi = max(nums)
        for i in range(0, len(nums)):
            if(nums[i] == maxi):
                return i
