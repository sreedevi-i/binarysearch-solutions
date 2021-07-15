/* Given an integer list nums where each number represents the maximum number of hops you can make, determine whether you can reach to the last index starting at index 0.*/
import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
          int maxReach = 0;
        if (nums.length == 1)
            return true;
        if (nums[0] == 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            maxReach = Math.max(maxReach, nums[i] + i);
            if (maxReach >= nums.length - 1)
                return true;
            if (i + 1 > maxReach)
                return false;
        }
        return false;
    }
}
