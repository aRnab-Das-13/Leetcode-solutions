class Solution {
    public double trimMean(int[] arr) {

        Arrays.sort(arr);

        int remove = arr.length / 20;

        double sum = 0;

        for (int i = remove; i < arr.length - remove; i++) {
            sum += arr[i];
        }

        return sum / (arr.length - 2 * remove);
    }
}