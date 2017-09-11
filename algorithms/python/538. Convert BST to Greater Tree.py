# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    Sum = 0

    def inoder(self,root):
        if root == None:
            return
        if root.right != None:
            self.inoder(root.right)
        self.Sum += root.val
        root.val = self.Sum
        if root.left != None:
            self.inoder(root.left)

    def convertBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        self.Sum = 0
        self.inoder(root)
        return root


