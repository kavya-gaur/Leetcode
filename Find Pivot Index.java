class Solution {
    public int pivotIndex(int[] nums) {
        int l =nums.length;
        int left = 0;
        int sum= 0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
        }

        for(int i=0;i<l;i++){
            sum-=nums[i];
            if(left==sum)return i;
            left+=nums[i];
        }

        return -1;
        
    }
}