import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i+1>=n || nums[i]!=nums[i+1])
            count+=1;
        }
        return count;
    }
}
