class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        helper(nums, curr, 0);
        return ans;
    }

    private void helper(int[] nums, List<Integer> curr, int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        helper(nums, curr, i + 1);
        curr.remove(curr.size() - 1);
        helper(nums, curr, i + 1);
    }
}