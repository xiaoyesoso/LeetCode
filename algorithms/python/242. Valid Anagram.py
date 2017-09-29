class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
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
                    return False
                else:
                    dic[c] -= 1
            else:
                return False

        se = set(s)
        for c in se:
            if dic[c] != 0:
                return False

        return True