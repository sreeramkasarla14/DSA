class Solution:
    def getXORSum(self, arr1: list[int], arr2: list[int]) -> int:
        l1=0
        for i in arr1:
            l1=l1^i
        l2=0
        for j in arr2:
            l2=l2^j
        return l1 & l2

        