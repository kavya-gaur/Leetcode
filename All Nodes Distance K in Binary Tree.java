/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<>();
    Map<TreeNode, TreeNode> parents = new HashMap<>();
    Set<TreeNode> vis = new HashSet<>();
    Queue<TreeNode> q = new LinkedList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        int distance = 0;
        findParents(root, null);

        q.offer(target);
        vis.add(target);

        while (!q.isEmpty()) {
            int levelsize = q.size();
            if (distance == k) {
                for (int i = 0; i < levelsize; i++) {
                    TreeNode curr = q.poll();
                    result.add(curr.val);
                }
            }

            for (int i = 0; i < levelsize; i++) {
                TreeNode curr = q.poll();
                if (curr == null)
                    continue;
                if (curr.left != null && !vis.contains(curr.left)) {
                    q.add(curr.left);
                    vis.add(curr.left);
                }
                if (curr.right != null && !vis.contains(curr.right)) {
                    q.add(curr.right);
                    vis.add(curr.right);
                }
                if (parents.get(curr) != null && !vis.contains(parents.get(curr))) {
                    q.add(parents.get(curr));
                    vis.add(parents.get(curr));
                }

            }
            distance++;

        }

        return result;

    }

    private void findParents(TreeNode root, TreeNode parent) {
        if (root == null)
            return;
        parents.put(root, parent);
        if (root.left != null)
            findParents(root.left, root);
        if (root.right != null)
            findParents(root.right, root);
    }
}