class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        l=sorted(nums1+nums2)
        if len(l)%2!=0:
            return l[int(((len(l)+1)/2))-1]
        else:
            x=int(len(l)/2)
            return (l[x-1]+l[x])/2  

        