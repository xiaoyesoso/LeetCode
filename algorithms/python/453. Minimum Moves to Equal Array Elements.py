import sys
class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return 0
        Min = sys.maxint
        Sum = 0
        for x in nums:
            Min = min(Min,x)
            Sum += x
        return Sum - Min*len(nums)
