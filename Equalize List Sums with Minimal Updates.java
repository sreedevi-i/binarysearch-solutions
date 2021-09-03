/* You are given two lists of integers a and b where every element in both lists is between 1 to 6. Consider an operation where you pick a number in either a or b and update its value to a number between 1 to 6.

Return the minimum number of operations required such that the sum of a and b are equal. If it's not possible, return -1.*/
import java.util.*;

class Solution {
    public int solve(int[] A, int[] B) {
         int[] ops = new int[10]; // number of operations of each change value
        int diff = Math.abs(sum(A) - sum(B));
        if (sum(A) > sum(B)) {
            for (int a : A) ops[a - 1] += 1;
            for (int b : B) ops[6 - b] += 1;
        } else {
            for (int a : A) ops[6 - a] += 1;
            for (int b : B) ops[b - 1] += 1;
        }
        int ans = 0;
        int ind = 9;
        // greedily pick the operation which causes the biggest change
        while (ind > 0) {
            while (ind > 0 && ops[ind] == 0) ind--;
            if (diff <= 0)
                break;
            ans++;
            diff -= ind;
            ops[ind] -= 1;
        }
        if (diff <= 0) {
            return ans;
        } else {
            return -1;
        }
    }

    public int sum(int[] A) {
        int s = 0;
        for (int a : A) s += a;
        return s;
    }
}
