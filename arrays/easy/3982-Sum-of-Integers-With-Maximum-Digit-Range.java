class Solution {
    public int maxDigitRange(int[] nums) {
        int maxDigitRange = -1;
        int sum = 0;

        for (int num : nums) {
            int temp = num;
            int minDigit = 9;
            int maxDigit = 0;

            while (temp > 0) {
                int digit = temp % 10;
                minDigit = Math.min(minDigit, digit);
                maxDigit = Math.max(maxDigit, digit);
                temp /= 10;
            }

            int range = maxDigit - minDigit;

            if (range > maxDigitRange) {
                maxDigitRange = range;
                sum = num;
            } else if (range == maxDigitRange) {
                sum += num;
            }
        }

        return sum;
    }
}