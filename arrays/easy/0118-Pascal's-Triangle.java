import java.util.*;
class Solution {
    public List<Integer> GenerateRow(int row){
        List<Integer> resultRow = new ArrayList<>();
        int ans = 1;
        resultRow.add(1);
        for(int i = 1; i < row; i++){
            ans *= (row-i);
            ans = ans / i;
            resultRow.add(ans);
        }
        return resultRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> totalRows =  new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            totalRows.add(GenerateRow(i));
        }
        return totalRows;
    }
}