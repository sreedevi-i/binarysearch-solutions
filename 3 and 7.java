/* Given a positive integer n, determine whether you can make n by summing up some non-negative multiple of 3 and some non-negative multiple of 7.*/
import java.util.*;

class Solution {
    public boolean solve(int n) {
         if (n == 1 || n == 2 || n == 4 || n == 5 || n == 8 || n == 11)
            return false;

        return true;
    }
}
