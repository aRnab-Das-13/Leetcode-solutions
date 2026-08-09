class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = 0;
        for(int i : nums){
            high += i;
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canPossible(nums, k, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans ;
    }
    public boolean canPossible(int[] nums, int k, int maxSum ){
        int noOfSubArrays = 1;
        int sum = 0;
        for(int i : nums){
            if(sum + i <= maxSum ){
                sum += i;
            } else {
                noOfSubArrays++;
                sum = i;
                if(noOfSubArrays > k){
                    return false;
                }
            }
        }
        return true;
    }
}