class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        strArr = s.split(' ')
        result = ''
        first = True
        for str in strArr:
            if first:
                first = False
                result += str[::-1]
            else:
                result += ' ' + str[::-1]
        return  result