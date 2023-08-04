class Solution {
    public Map<String, Boolean> dp = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s,wordDict);
    }
    public boolean helper(String s, List<String> wordDict){
        if (s.length() == 0) {
            return true;
        }
        if(dp.containsKey(s))return dp.get(s);
        for(int i=0;i<s.length();i++){
            if(wordDict.contains(s.substring(0,i+1))){
                if(helper(s.substring(i+1),wordDict)){
                    dp.put(s,true);
                    return true;
                }
            }
        }
        dp.put(s,false);
        return false;
    }
    
}