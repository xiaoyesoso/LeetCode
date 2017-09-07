class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        num_str = str(num)
        while len(num_str) > 1:
            num = 0
            for c in num_str:
                num += int(c)
            num_str = str(num)
        return int(num_str)

