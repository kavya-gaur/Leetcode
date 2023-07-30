/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return help(root, targetSum, 0);
    }

    public boolean help(TreeNode root, int targetSum, int sum) {
        if (root == null)
            return false;
        boolean a = false, b = false;
        if (root.left != null)
            a = help(root.left, targetSum, sum + root.val);
        if (root.right != null)
            b = help(root.right, targetSum, sum + root.val);
        if (root.left != null || root.right != null)
            return a || b;
        return sum + root.val == targetSum;

    }
}