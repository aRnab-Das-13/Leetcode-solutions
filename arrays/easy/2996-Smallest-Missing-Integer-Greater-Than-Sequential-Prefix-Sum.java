class Solution {
    public int missingInteger(int[] nums) {

        int prefixSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                prefixSum += nums[i];
            } else {
                break;
            }
        }
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            seen.add(num);
        }

        while(seen.contains(prefixSum)){
            prefixSum++;
        }
        return prefixSum;
    }
    
}