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
