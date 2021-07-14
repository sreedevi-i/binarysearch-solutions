/* Given a list of integers nums, and integers k and target, return the number of sublists whose length is k and its average value ≥ target*/
import java.util.*;

class Solution {
    public int solve(int[] nums, int k, int target) {
        int sum = 0, c = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if (sum / k >= target)
            c++;
        for (int i = 1; i < nums.length - k + 1; i++) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            if (sum / k >= target)
                c++;
        }
        return c;
    }
}
