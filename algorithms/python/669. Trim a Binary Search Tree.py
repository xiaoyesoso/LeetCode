# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    def trimBST(self, root, L, R):
        """
        :type root: TreeNode
        :type L: int
        :type R: int
        :rtype: TreeNode
        """
        if root == None:
            return None
        while root != None and not (root.val >= L and root.val <= R):
            if root.right != None and root.val < L:
                root = root.right
            elif root.left != None and root.val > R:
                root = root.left
            else:
                root = None

        if root != None:
            root.left = self.trimBST(root.left, L, R)
            root.right = self.trimBST(root.right, L, R)

        return root
