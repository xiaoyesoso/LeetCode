class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        dic = {}
        for c in s:
            if dic.has_key(c):
                dic[c] += 1
            else:
                dic[c] = 1

        for c in t:
            if dic.has_key(c):
                if dic[c] == 0:
                    return str(c)
                else:
                    dic[c] -= 1
            else:
                return str(c)


