class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while ( low < high){
            int middle = low + (high - low)/2 ;
            if(nums[middle] >= target ){
                high = middle;
            }
            else{
                low = middle + 1;
            }
        }
        return(low < nums.length && nums[low] == target) ? low : -1;
        
    }
}
