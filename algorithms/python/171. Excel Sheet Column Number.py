class Solution(object):
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        Sum = 0
        for c in s:
            Sum = Sum * 26 + (ord(c) - ord('A') +1)
        return Sum
