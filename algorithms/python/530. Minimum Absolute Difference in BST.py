# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

import sys
class Solution(object):


    arr = []

    def inoder(self,root):
        if root == None:
            return
        if root.left != None:
            self.inoder(root.left)
        self.arr.append(root.val)
        if root.right != None:
            self.inoder(root.right)



    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.arr = []
        self.inoder(root)
        Min = sys.maxint
        for index in range(len(self.arr)):
            if index != 0:
                tmp = self.arr[index] - self.arr[index-1]
                Min = min(tmp,Min)
        return Min

