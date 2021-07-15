/*Given a non-negative integer n, find a number r such that r * r = n and round down to the nearest integer.

Can you implement this without using the built-in square root?*/
import java.util.*;

class Solution {
    public int solve(int n) {
        if (n == 0 || n == 1)
            return n;

        long left = 1, right = n / 2, mid = 0, ans = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (mid * mid == n)
                return (int) mid;
            if (mid * mid < n) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }

        return (int)ans;
    }
}
