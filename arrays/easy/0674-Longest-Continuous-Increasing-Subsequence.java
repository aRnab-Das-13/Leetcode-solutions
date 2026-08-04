class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int c = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                c++;
            } else {
                c = 1;
            }

            count = Math.max(count, c);
        }

        return count;
    }
}