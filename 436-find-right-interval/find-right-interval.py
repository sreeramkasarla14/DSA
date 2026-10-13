class Solution:
    def findRightInterval(self, intervals: list[list[int]]) -> list[int]:
        st=tuple(i[0] for i in intervals)
        ind=tuple(i for i in range(len(intervals)))
        t=sorted(zip(st,ind))
        res=[]
        for start,end in intervals:
            idx=bisect.bisect_left(t,(end,-1))
            if idx<len(intervals):
                res.append(t[idx][1])
            else:res.append(-1)
        return res

