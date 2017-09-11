import math

class Solution(object):
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        n = int(math.sqrt(area))
        if n*n == area:
            return [n,n]
        n = n+1
        while(area % n != 0):
            n = n+1
        return [n,area/n]
