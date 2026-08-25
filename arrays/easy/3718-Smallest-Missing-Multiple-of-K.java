class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int i = 2;
        int num = k;
        while(set.contains(k)){
            k = num * i;
            i ++;
        }
        return k;
    }
}