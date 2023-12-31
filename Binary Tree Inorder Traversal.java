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
    List<Integer> l = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        help(root);
        return l;

    }

    public void help(TreeNode root) {
        if (root == null)
            return;
        help(root.left);
        l.add(root.val);
        help(root.right);

    }

}