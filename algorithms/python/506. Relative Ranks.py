class Solution(object):
    def findRelativeRanks(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        sorted_nums = sorted(nums,reverse = True)
        cnt = 1
        n = nums[0]
        dic = {}
        for c in sorted_nums:
            if not dic.has_key(c):
                dic[c] = cnt
            cnt += 1
        r = []
        for c in nums:
            if dic[c] == 1:
                r.append("Gold Medal")
            elif dic[c] == 2:
                r.append("Silver Medal")
            elif dic[c] == 3:
                r.append("Bronze Medal")
            else:
                r.append(str(dic[c]))
        return r


