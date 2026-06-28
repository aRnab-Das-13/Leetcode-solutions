/*
Problem: 228. Summary Ranges

Approach:
Two pointer 

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        int i = 0;
        
        for(int j = 1; j < nums.length; j++){
            if(nums[j] == nums[j-1]+1){
                continue;
            } else {
                if(nums[i] == nums[j-1]){
                    ans.add(String.valueOf(nums[i]));
                }
                else {
                    ans.add(nums[i]+"->"+nums[j-1]);
                }
                i = j;
            }

        }
        if (nums[i] == nums[nums.length - 1]) {
            ans.add(String.valueOf(nums[i]));
        } else {
            ans.add(nums[i] + "->" + nums[nums.length - 1]);
        }
        return ans;
    }
}