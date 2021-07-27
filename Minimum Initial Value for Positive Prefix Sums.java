/* You are given a list of integers nums. Return the minimum positive value we can append to the beginning of nums such that prefix sums of the resulting list contains numbers that are all greater than 0.*/
import java.util.*;

class Solution {
    public int solve(int[] nums) {
         int min = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }
        return -1 * min + 1;
    }
}
