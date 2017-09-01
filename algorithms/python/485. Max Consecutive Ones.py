class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cnt = 0
        Max = -1
        for x in nums:
            if x == 1:
                cnt += 1
            else:
                if cnt > Max:
                    Max = cnt
                cnt = 0
        if cnt > Max:
            Max = cnt
            cnt = 0
        return Max
