# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

from collections import deque
class TreeNodeWithLevel():
    def __init__(self,node,level):
        self.node = node
        self.level = level

class Solution(object):
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        node = TreeNodeWithLevel(root,0)
        que = deque([])
        result = []
        que.append(node)
        nowlevel = 0
        tmpsum = 0.0
        cnt = 0.0
        while len(que) > 0:
            tmpNode = que.popleft()
            if tmpNode.level == nowlevel:
                tmpsum += tmpNode.node.val
                cnt += 1.0
            else:
                result.append(tmpsum/cnt)
                tmpsum = tmpNode.node.val
                cnt = 1.0
                nowlevel = tmpNode.level
            if tmpNode.node.left != None:
                que.append(TreeNodeWithLevel(tmpNode.node.left,nowlevel+1))
            if tmpNode.node.right != None:
                que.append(TreeNodeWithLevel(tmpNode.node.right,nowlevel+1))
        result.append(tmpsum / cnt)
        return  result

