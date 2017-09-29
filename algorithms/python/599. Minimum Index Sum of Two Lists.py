import sys
class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        s1 = set(list1)
        s2 = set(list2)
        s = s1.intersection(s2)
        d1 = {}
        d2 = {}
        cnt = 0
        for c in list1:
            d1[c] = cnt
            cnt += 1

        cnt = 0
        for c in list2:
            d2[c] = cnt
            cnt += 1

        m = sys.maxint
        result = []

        for c in s:
            n = d1[c] + d2[c]
            if n < m:
                m = n
                result = []
                result.append(c)
            elif n == m:
                result.append(c)

        return result
