class Solution(object):
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        r0 = len(nums)
        c0 = len(nums[0])
        if(r0*c0 != r * c):
            return nums;
        else:
            x = 0;y = 0
            result = []
            for i in range(r):
                tmp = []
                for j in range(c):
                    if y < c0:
                        tmp.append(nums[x][y])
                        y += 1
                    else:
                        y = 0
                        x += 1
                        tmp.append(nums[x][y])
                        y += 1
                result.append(tmp)
        return result
