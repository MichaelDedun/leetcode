package com.leetcode.arrays;

class Solution {
     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    private int xDepth = 0;
    private int yDepth = 0;
    private TreeNode xParent;
    private TreeNode yParent;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, 0, null, x, y);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode node, int depth, TreeNode parent, int x, int y) {
        if (xParent != null && yParent != null)
            return;

        if (node.val == x) {
            xDepth = depth;
            xParent = parent;
        }

        if (node.val == y) {
            yDepth = depth;
            yParent = parent;
        }

        if (node.left != null)
            dfs(node.left, depth + 1, node, x, y);

        if (node.right != null)
            dfs(node.right, depth + 1, node, x, y);
    }

}
