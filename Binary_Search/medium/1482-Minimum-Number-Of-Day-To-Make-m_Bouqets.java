class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int minDay = Integer.MAX_VALUE;
        for(int x : bloomDay){
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
        while( low <= high){
            int mid = low + (high - low) / 2;
            int ans = possible(bloomDay, mid, m, k);
            if(ans == 1){
                minDay = Math.min(minDay, mid);
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return minDay;
    }
    private int possible(int[] bloomDay, int day, int m, int k){
        int count = 0;
        int noOfB = 0;
        for(int x : bloomDay){
            if(x <= day){
                count ++;
            } else {
                noOfB += (count / k);
                count = 0;
            }
        }
        noOfB += (count / k);
        if(noOfB >= m){
            return 1;
        } else {
            return 0;
        }
    }
}