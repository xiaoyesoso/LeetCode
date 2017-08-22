class Solution(object):
    def distributeCandies(self, candies):
        """
        :type candies: List[int]
        :rtype: int
        """
        size = len(candies) / 2
        ss = set(candies)
        return min(len(ss),size)


