class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        l = len(prices)
        if l == 0:
            return 0
        low = prices[0]
        high = prices[0]
        i = 0
        earn = 0
        while i < l:
            while i+1 < l and prices[i] > prices[i+1]:
                i += 1
            low = prices[i]
            while i+1 < l and prices[i] <= prices[i+1]:
                i += 1
            high = prices[i]
            earn += high - low
            i += 1
        return earn