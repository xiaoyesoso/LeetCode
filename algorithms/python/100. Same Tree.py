# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if p == None:
            if q == None:
                return True
            else:
                return False

        if q == None:
            return False

        b = True
        b = b and self.isSameTree(p.left,q.left)

        if not b:
            return b

        b = b and self.isSameTree(p.right,q.right)

        if not b:
            return b

        if p.val != q.val:
            return False
        else:
            return b

