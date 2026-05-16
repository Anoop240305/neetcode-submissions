class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt();//max of piles
        int res = r ;//worst case takes max time

        while( l <= r){

            int k = (l + r)/2;//middle

            long time = 0;
            for( int p : piles){
                time += Math.ceil((double)p / k );//10piles/3=4hours

            }
            if(time <= h){
                res = k;//store this value and try for slower speeds 
                r = k - 1;//too fast can eat slow 

            }
            else{
                l = k + 1;//too slow eat fast 
            }
        }
        return res;
        
    }
}
