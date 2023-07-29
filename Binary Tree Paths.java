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
    List<String> l = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null)
            help(root, "");
        return l;
    }

    public void help(TreeNode root, String s) {
        if (root.left == null && root.right == null)
            l.add(s + root.val);
        if (root.left != null)
            help(root.left, s + root.val + "->");
        if (root.right != null)
            help(root.right, s + root.val + "->");
    }
}