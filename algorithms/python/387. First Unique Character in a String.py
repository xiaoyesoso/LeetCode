class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        dic = {}
        for c in s:
            if dic.has_key(c):
                dic[c] += 1
            else:
                dic[c] = 1
        for index in range(len(s)):
            if dic[s[index]] == 1:
                return index
        return -1

