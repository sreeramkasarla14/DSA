class Solution:
    def threeFibonacciSum(self, n: int) -> bool:
        a=0
        b=1
        c=a+b
        while(a+b+c<=n):
            if a+b+c==n:return True
            temp=b
            b=c
            a=temp
            c=a+b
        return False
        