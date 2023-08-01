/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c=0;
    public int goodNodes(TreeNode root) {
        int m = Integer.MIN_VALUE;
        helper(root,m);
        return c;
    }
    private void helper(TreeNode root, int m){
        if(root==null)return;
        if(root.val >=m)c++;
        helper(root.left,(int)Math.max(m,root.val));
        helper(root.right,(int)Math.max(m,root.val));

    }
}