/* You are given a list of integers nums of length n representing the current score of swimmers in a competition. There is one more round to swim and the first place winner for this round gets n points, second place n-1 points, etc. and the last place gets 1 point.

Return the number of swimmers that can still win the competition after the last round. If you tie for first in points, this still counts as winning.*/

import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int N = nums.length;
        Arrays.sort(nums);
        int best = 0; // minimum score of the winner
        for (int i = 0; i < N; i++) best = Math.max(best, nums[i] + (N - i));
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] + N >= best)
                ans++;
        }
        return ans;
    }
}
