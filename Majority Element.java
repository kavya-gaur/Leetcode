class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int m=1;
        int ans=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
                if(c>m){
                    ans=nums[i];
                    m=Math.max(c,m);
                }
            }
            else{
                c=1;
            }
        }
        return ans;
    }   
}