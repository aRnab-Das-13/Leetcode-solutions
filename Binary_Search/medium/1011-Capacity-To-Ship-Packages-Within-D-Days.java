class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        int ans = -1;
        for(int x : weights ){
            low = Math.max(low, x);
            high += x;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            int daysRequired = function(weights, mid);
            if(daysRequired <= days){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    private int function(int[] weights, int capacity){
        int days = 1;
        int load = 0;
        for(int x : weights){
            if(load + x > capacity){
                days += 1;
                load = x;
            } else {
                load += x;
            }
        }
        return days;
    }
}