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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        return helper(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int prestart, int preend, int[] postorder, int poststart, int postend) {
        if (prestart > preend || poststart > postend) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[prestart]);
        if (prestart < preend) {

            int leftroot = preorder[prestart + 1];
            int lefttreesize = 0;
            int lefttreeindex = 0;
            for (int i = 0; i <= postend; i++) {
                if (postorder[i] == leftroot) {
                    lefttreeindex = i;
                    lefttreesize = lefttreeindex - poststart + 1;
                }
            }
            root.left = helper(preorder, prestart + 1, prestart + lefttreesize, postorder, poststart, lefttreeindex);
            root.right = helper(preorder, prestart + lefttreesize + 1, preend - 1, postorder, lefttreeindex + 1,
                    postend - 1);

        }
        return root;

    }
}