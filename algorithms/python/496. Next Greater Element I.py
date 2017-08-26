class Solution(object):
    def nextGreaterElement(self, findNums, nums):
        """
        :type findNums: List[int]
        :type nums: List[int]
        :rtype: List[int]
        """
        dic = {}
        for i in range(len(nums)):
            find  = False
            j = i +1
            while(j < len(nums) and not find):
                if nums[i] < nums[j]:
                    dic[nums[i]] = nums[j]
                    find = True
                j += 1

            if not find:
                dic[nums[i]] = -1

        list = []
        for n in  findNums:
            list.append(dic[n])

        return list