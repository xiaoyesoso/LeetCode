# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    def change(self,root):
        if root == None:
            return None

        tmp = self.change(root.left)
        root.left = self.change(root.right)
        root.right = tmp

        return root
        

    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        return self.change(root)

