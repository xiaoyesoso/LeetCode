class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        s1 = set('qwertyuiopQWERTYUIOP')
        s2 = set('asdfghjklASDFGHJKL')
        s3 = set('zxcvbnmZXCVBNM')
        list = []
        for w in words:
            first = w[0]
            tag = -1
            if first in s1:
                tag = 1
            elif first in s2:
                tag = 2
            else:
                tag = 3
            isit = True
            for c in w:
                if tag == 1:
                    if c not in s1:
                        isit = False
                        break
                elif tag == 2:
                    if c not in s2:
                        isit = False
                        break
                else:
                    if c not in s3:
                        isit = False
                        break
            if isit:
                list.append(w)
        return list
