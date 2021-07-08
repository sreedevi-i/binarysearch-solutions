import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n>=2){
        if(nums[n-1]<=(nums[n-2]*2))
        return false;}
        return true;
    }
}
