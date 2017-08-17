class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        cnt = 0
        for i in range(0,len(nums),2):
            cnt += nums[i]
        return cnt