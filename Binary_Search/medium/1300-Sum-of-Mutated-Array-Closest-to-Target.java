class Solution {

    public int findBestValue(int[] arr, int target) {

        int max = 0;

        for (int num : arr)
            max = Math.max(max, num);

        int left = 0;
        int right = max;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int sum = getSum(arr, mid);

            if (sum < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        int sum1 = getSum(arr, left);
        int sum2 = getSum(arr, left - 1);

        if (Math.abs(sum2 - target) <= Math.abs(sum1 - target))
            return left - 1;

        return left;
    }

    private int getSum(int[] arr, int value) {

        int sum = 0;

        for (int num : arr)
            sum += Math.min(num, value);

        return sum;
    }
}