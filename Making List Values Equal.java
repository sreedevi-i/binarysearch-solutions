/* You are given a list of integers nums. Consider an operation where we select some subset of integers in the list and increment all of them by one.

Return the minimum number of operations needed to make all values in the list equal to each other.*/
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        return max-min;
    }
}
