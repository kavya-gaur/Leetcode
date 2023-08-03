class Solution {
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        Map<Integer, String> m = new HashMap<>();
        m.put(2, "abc");
        m.put(3, "def");
        m.put(4, "ghi");
        m.put(5, "jkl");
        m.put(6, "mno");
        m.put(7, "pqrs");
        m.put(8, "tuv");
        m.put(9, "wxyz");
        if (digits.length() == 0)
            return new ArrayList<>();
        helper("", digits, 0, m);
        return result;

    }

    private void helper(String c, String digits, int idx, Map<Integer, String> m) {
        // backtracking
        if (c.length() == digits.length()) {
            result.add(c);
            return;
        }

        int digit = digits.charAt(idx) - '0';
        String letters = m.get(digit);

        if (letters != null) {
            for (char d : letters.toCharArray()) {
                helper(c + d, digits, idx + 1, m);
            }
        }
    }
}