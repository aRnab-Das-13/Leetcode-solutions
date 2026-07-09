class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = - 1;
        for(int x : nums){
           
            high = Math.max(high, x);
        }
        while( low <= high ){
            int mid = low + (high - low) / 2;
            if(possible(nums, mid, threshold)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
        
    }
    private Boolean possible(int[] nums, int divisor, int threshold){
        int sum = 0;
        for(int x : nums){
            sum += (x + divisor - 1) / divisor;
        }
        if(sum <= threshold){
            return true;
        } else {
            return false ;
        }

    }
}