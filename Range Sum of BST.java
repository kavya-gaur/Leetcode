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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root, low, high, 0);
    }

    public int sum(TreeNode root, int low, int high, int sum) {
        if (root == null)
            return 0;
        int left = sum(root.left, low, high, sum);
        int right = sum(root.right, low, high, sum);
        if (low <= root.val && root.val <= high)
            return root.val + sum + left + right;
        return left + right + sum;

    }

}