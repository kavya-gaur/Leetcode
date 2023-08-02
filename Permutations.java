class Solution {
    List<Integer> current = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        boolean[] vis = new boolean[nums.length];
        helper(nums, vis, current, ans);
        return ans;

    }

    private void helper(int[] nums, boolean[] vis, List<Integer> current, List<List<Integer>> ans) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!vis[i]) {
                current.add(nums[i]);
                vis[i] = true;
                helper(nums, vis, current, ans);
                vis[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }
}