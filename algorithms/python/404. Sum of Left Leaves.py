# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    Sum = 0
    def cntSum(self,root):
        if root == None:
            return
        if root.left != None:
            if root.left.left == None and root.left.right == None:
                self.Sum += root.left.val
        self.cntSum(root.left)
        self.cntSum(root.right)

    def sumOfLeftLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.Sum = 0
        self.cntSum(root)
        return self.Sum
