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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;
        TreeNode root = null;
        if (root1 == null) {
            root = new TreeNode(root2.val);
            root.left = mergeTrees(root1, root2.left);
            root.right = mergeTrees(root1, root2.right);
            return root;
        } else if (root2 == null) {
            root = new TreeNode(root1.val);
            root.left = mergeTrees(root1.left, root2);
            root.right = mergeTrees(root1.right, root2);
            return root;
        } else {
            root = new TreeNode(root1.val + root2.val);
        }
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;

    }
}