# Definition for a binary tree node.
class TreeNode(object):
     def __init__(self, x):
         self.val = x
         self.left = None
         self.right = None

class Solution(object):

    s = 0

    def cal(self,root):
        if root == None:
            return 0
        l = 0
        r = 0
        if root.left != None:
            l = self.cal(root.left)
        if root.right != None:
            r = self.cal(root.right)
        self.s += abs(l - r)
        return l + r + root.val

    def findTilt(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.s = 0
        self.cal(root)
        return self.s

node1 = TreeNode(1)
node1.left = TreeNode(2)
node1.right = TreeNode(3)

s = Solution()
s.cal(node1)
