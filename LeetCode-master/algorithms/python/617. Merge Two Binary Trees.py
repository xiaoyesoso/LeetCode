# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    def build(self,t1,t2):
        if t2 == None:
            return t1
        elif t1 == None and t2 != None:
            return t2
        elif t1!= None and t2 != None:
            t1.val += t2.val

        t1.left = self.build(t1.left,t2.left)
        t1.right = self.build(t1.right,t2.right)

        return t1

    def mergeTrees(self, t1, t2):
        """
        :type t1: TreeNode
        :type t2: TreeNode
        :rtype: TreeNode
        """
        return self.build(t1,t2)

