class Solution {
    public int maxArea(int[] heights) {
        int left = 0 ;
        int right = heights.length -1;
        int maxH = 0;
        while(left < right){
            int area = Math.min(heights[left] , heights[right] )* (right-left);
            maxH = Math.max(maxH , area);
            if(heights[left] <= heights[right]){
                left++;

            }else{
                right--;
            }
        }
        return maxH;
        
    }
}
