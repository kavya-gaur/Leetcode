class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> l = new ArrayList<>();
        helper(1, n, k, l);
        return list;

    }

    private void helper(int start, int n, int k, List<Integer> currlist) {
        if (currlist.size() == k) {
            list.add(new ArrayList<>(currlist));
            return;
        }
        for (int i = start; i <= n; i++) {
            currlist.add(i);
            helper(i + 1, n, k, currlist);
            currlist.remove(currlist.size() - 1);
        }

    }
}