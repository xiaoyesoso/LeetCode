class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if word.isupper() or word.islower() or (len(word) > 1 and word[:1].isupper() and word[1:].islower()):
            return True
        else:
            return False
