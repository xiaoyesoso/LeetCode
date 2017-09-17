class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        dic = {}
        for c in magazine:
            if dic.has_key(c):
                dic[c] += 1
            else:
                dic[c] = 1
        for c in ransomNote:
            if dic.has_key(c):
                if dic[c] > 0:
                    dic[c] -= 1
                else:
                    return False
            else:
                return False
        return True