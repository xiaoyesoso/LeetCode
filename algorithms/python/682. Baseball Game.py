class Solution(object):
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """
        s = 0
        arr = []
        for c in ops:
            n = 0
            if c == 'C':
                n = -arr[len(arr) - 1]
                arr.pop()
            elif c == '+':
                n = arr[len(arr)-1] + arr[len(arr)-2]
                arr.append(n)
            elif c == 'D':
                n = arr[len(arr)-1] * 2
                arr.append(n)
            else:
                n = int(c)
                arr.append(n)
            s += n
        return s


s = Solution()
s.calPoints(["5","-2","4","C","D","9","+","+"])