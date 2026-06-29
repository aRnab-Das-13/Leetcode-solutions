class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>();
    int n = rowIndex+1;
    result.add(1);
    long ans  =1;
    for(int i = 1; i < n; i++){
        ans = ans * (n - i);
        ans = ans / i;
        result.add((int) ans);
    }
    return result;
    }
}