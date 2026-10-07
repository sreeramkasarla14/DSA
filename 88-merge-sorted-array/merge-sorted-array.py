class Solution:
    def merge(self, nums1: list[int], m1: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        v=m1
        for i in nums2:
            l=0
            u=v-1
            while(l<=u):
                m=(l+u)//2
                if nums1[m]==i:l=m+1
                elif nums1[m]<i:
                    l=m+1
                else:
                    u=m-1
            nums1.insert(l,i)
            v=v+1
        del nums1[m1+n:]