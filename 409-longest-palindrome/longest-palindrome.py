class Solution:
    def longestPalindrome(self, s: str) -> int:
        st=set(s)
        count=0
        odd=[]
        for i in st:
            c=s.count(i)
            if(c%2==0):
                count=count+c
            else:
                count=count+c-1
                odd.append(1)
        if(len(odd)>0):count=count+1
        return count
        
            
            
        