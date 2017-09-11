class Solution(object):
    def maxCount(self, m, n, ops):
        """
        :type m: int
        :type n: int
        :type ops: List[List[int]]
        :rtype: int
        """
        if len(ops) == 0:
            return m*n
        Min1 = max(m,n)+1
        Min2 = Min1
        for list in  ops:
            Min1 = min(list[0],Min1)
            Min2 = min(list[1],Min2)
        return Min1 * Min2

