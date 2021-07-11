/* Given a list of unsorted integers nums, and an integer k, return the kth (0-indexed) smallest element in the list.

This should be done in \mathcal{O}(n)O(n) time on average.*/
import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k];
    }
}
