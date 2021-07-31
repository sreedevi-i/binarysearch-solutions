/* You are given a list of integers tasks where each different integer represents a different task type, and a non-negative integer k. Each task takes one unit of time to complete and each task must be done in order, but you must have k units of time between doing two tasks of the same type. At any time, you can be doing a task or waiting.

Return the amount of time it takes to complete all the tasks.*/
import java.util.*;

class Solution {
    public int solve(int[] tasks, int k) {
        
         int ans = 0;
        HashMap<Integer, Integer> prev = new HashMap<Integer, Integer>();
        for (int t : tasks) prev.put(t, Integer.MIN_VALUE);
        for (int t : tasks) {
            ans = Math.max(ans + 1, prev.get(t) + k + 1);
            prev.put(t, ans);
        }
        return ans;
    }
}
