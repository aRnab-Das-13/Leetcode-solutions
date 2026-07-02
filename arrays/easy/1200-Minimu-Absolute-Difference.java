class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDis = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            minDis = Math.min(minDis, (arr[i+1] - arr[i]));
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++){
            if((arr[i+1] - arr[i] == minDis)){
                 res.add(Arrays.asList(arr[i], arr[i+1]));
            }

        }
        return res;
    }
}