class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int x : piles){
            high = Math.max(high, x);
        }

        while( low <= high ){
            int mid = low + (high - low) / 2;
            if(hoursRequired(piles, mid) <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            
        }
        return low;
   
    }
    private long hoursRequired(int[] piles, int k){
        long hours = 0;
        for(int bananas: piles){
            hours += (bananas + k - 1) / k;
        }
        return hours;
    }
    
}