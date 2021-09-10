import java.util.*;

class Solution {
    public boolean solve(int[] nums, int k) {
         if (k == 0)
            return true;
        final int N = nums.length;
        Set<Integer>[] sets = new HashSet[nums.length];

        for (int j = 0; j != N; j++) {
            Set<Integer> setj = new HashSet<>();
            sets[j] = setj;
            setj.add(nums[j]);

            Set<Integer> seti = null; // set available to use
            if (j >= 2)
                seti = sets[j - 2];
            if (j >= 3)
                seti.addAll(sets[j - 3]);

            if (seti != null) {
                for (Integer prev : seti) {
                    int next = prev + nums[j];
                    if (next > k)
                        continue;
                    setj.add(next);
                }
            }

            if (setj.contains(k))
                return true;
        }
        return false;
}
}
