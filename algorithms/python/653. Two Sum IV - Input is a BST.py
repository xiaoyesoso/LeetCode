# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    list = []

    def getNum(self,root):
        if root == None:
            return
        if root.left != None:
            self.getNum(root.left)
        self.list.append(root.val)
        if root.right != None:
            self.getNum(root.right)

    def findTarget(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: bool
        """
        self.list = []
        self.getNum(root)
        dic = {}
        for num in self.list:
            if dic.has_key(num):
                dic[num] += 1
            else:
                dic[num] = 1

        for index in range(len(self.list)):
            num = self.list[index]
            if num > k/2:
                break
            dic[num] -= 1
            target = k - num
            if dic.has_key(target) and dic[target] > 0:
                return True
            dic[num] += 1
        return False

