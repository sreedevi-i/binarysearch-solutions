/* Given an integer n, we apply this transformation until it becomes a 1: take each of the digits in n, square it, and then take their sum.

Return whether n will end up in 1 after the transformations.*/
import java.util.*;

class Solution {
    public int calcSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (int) Math.pow((n % 10), 2);
            n = n / 10;
        }
        return sum;
    }
    public boolean solve(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (true) {
            int sum = calcSquareSum(n);
            if (sum == 1)
                return true;
            if (set.contains(sum))
                return false;
            else
                set.add(sum);
            n = sum;
        }
    }
}
