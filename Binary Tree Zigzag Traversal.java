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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        List<Integer> l = new ArrayList<>();
        if (root == null)
            return ans;
        else {
            q.add(root);

            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    if (curr == null)
                        continue;
                    if (curr.left != null)
                        q.add(curr.left);
                    if (curr.right != null)
                        q.add(curr.right);
                    if (flag)
                        l.add(curr.val);
                    else {
                        l.add(0, curr.val);
                    }
                }
                ans.add(new ArrayList<>(l));
                l = new ArrayList<>();
                flag = !flag;
            }
            return ans;
        }

    }
}