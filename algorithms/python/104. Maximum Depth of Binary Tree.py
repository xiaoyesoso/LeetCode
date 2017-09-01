# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    max_depth = 0

    def find(self,root,now_depth):
        if root != None:
            now_depth += 1
            self.find(root.left,now_depth)
            self.find(root.right,now_depth)
        else:
            self.max_depth = max(self.max_depth,now_depth)


    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.max_depth = 0
        self.find(root,0)
        return  self.max_depth
