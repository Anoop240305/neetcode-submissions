class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0] ;
        int cur = 0;
        for(int num : nums){
            if(cur < 0){
                cur = 0;
            }
            cur += num;
            maxSub = Math.max(maxSub,cur);

        }
        return maxSub;
       
        
    
        
    }
}
