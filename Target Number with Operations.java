/* Given positive integers start and end (start < end), return the minimum number of operations needed to convert start to end using these operations:

Increment by 1
Multiply by 2*/
import java.util.*;

class Solution {
    public int solve(int start, int end) {
        int ops = 0;
        while (end / 2 >= start) {
            ops += 1 + (end % 2);
            end /= 2;
        }
        return ops + end - start;
    }
}
