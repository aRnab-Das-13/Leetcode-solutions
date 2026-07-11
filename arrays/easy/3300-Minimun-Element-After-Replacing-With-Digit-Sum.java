class Solution {
    public int minElement(int[] nums) { 
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int digitSum = 0;
            int num = nums[i];
            while(num > 0){
                int digit = num % 10;
                digitSum += digit;
                num = num / 10;
            }
            min = Math.min(min, digitSum);
            nums[i] = digitSum;

        }
        return min;
    }
}