class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0; int curSum = 0;
        HashMap<Integer , Integer> PrefixSum = new HashMap<>();
        PrefixSum.put(0,1);
        for (int num : nums){
            curSum += num;
            int diff = curSum - k;
            res+= PrefixSum.getOrDefault(diff,0);

            PrefixSum.put(curSum , PrefixSum.getOrDefault(curSum,0) + 1);
            
        }
        return res;
    }
}
    

        