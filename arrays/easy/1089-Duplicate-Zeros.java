class Solution {
    public void duplicateZeros(int[] arr) {

        int zeros = 0;
        int n = arr.length;

        // Count zeros
        for (int num : arr) {
            if (num == 0)
                zeros++;
        }

        int i = n - 1;
        int j = n + zeros - 1;

        while (i >= 0) {

            // Copy current element if within bounds
            if (j < n)
                arr[j] = arr[i];

            // Duplicate zero
            if (arr[i] == 0) {
                j--;

                if (j < n)
                    arr[j] = 0;
            }

            i--;
            j--;
        }
    }
}