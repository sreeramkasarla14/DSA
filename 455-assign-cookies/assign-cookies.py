class Solution:
    def findContentChildren(self, g: list[int], s: list[int]) -> int:
        g.sort()
        s.sort()
        child=0
        cookie=0
        while child<len(g) and cookie<len(s):
            if g[child]<=s[cookie]:child=child+1
            cookie=cookie+1
        return child

        
        