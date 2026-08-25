class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        result.add(nums[0]);
        arr2.add(nums[1]);
        int i = 0;
        int j = 1;
        for(int num = 2; num < nums.length; num++){
            if(nums[i] > nums[j]){
                result.add(nums[num]);
                i = num;
            } else {
                arr2.add(nums[num]);
                j = num;
            }
        }
        result.addAll(arr2);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}