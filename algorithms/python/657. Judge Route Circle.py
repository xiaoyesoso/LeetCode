class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        dis1 = 0;dis2 = 0
        for c in moves:
            if c == 'R':
                dis1 += 1
            elif c == 'L':
                dis1 -= 1
            elif c == 'U':
                dis2 += 1
            elif c == 'D':
                dis2 -= 1
        return (dis1 == 0) and (dis2 == 0)