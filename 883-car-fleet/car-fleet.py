class Solution:
    def carFleet(self, target: int, position: list[int], speed: list[int]) -> int:
        d={}
        for i in range(len(speed)):
            d[position[i]]=speed[i]
        d=dict(sorted(d.items()))
        k=len(speed)-1
        fleet=0
        maxt=0
        time=[]
        for i in d:
            time.append((target-i)/d[i])
        while(k>=0):
            if time[k]>maxt:
                maxt=time[k]
                fleet=fleet+1
            k=k-1
        return fleet

        