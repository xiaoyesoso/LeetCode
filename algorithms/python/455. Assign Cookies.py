class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        sg = sorted(g)
        ss = sorted(s)
        i = 0
        j = 0
        cnt = 0
        while i < len(sg):
            while j < len(ss) and sg[i] > ss[j]:
                j += 1
            if j == len(ss):
                break
            cnt += 1
            j += 1
            i += 1
        return cnt


