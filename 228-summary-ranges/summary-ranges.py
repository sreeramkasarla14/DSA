class Solution:
    def summaryRanges(self, nums: list[int]) -> list[str]:
        i=0
        result=[]
        while i<len(nums):
            start=nums[i]
            while i+1<len(nums) and nums[i+1]==nums[i]+1:
                i=i+1
            if start==nums[i]:
                result.append(f"{start}")
            else:
                result.append(f"{start}->{nums[i]}")
            i=i+1
        return result

        