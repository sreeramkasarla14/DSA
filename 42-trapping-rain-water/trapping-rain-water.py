class Solution:
    def trap(self, height: list[int]) -> int:
        m=max(height)
        lm=0
        sum=0
        i=0
        while(i<len(height) and height[i]<m):
            if(height[i]>lm):lm=height[i]
            sum=sum+(lm-height[i])
            i=i+1
        rm=0
        for j in range(len(height)-1,i,-1):
            if(height[j]>rm):
                rm=height[j]
            sum=sum+(rm-height[j])
        return sum
            

            
        