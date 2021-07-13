/* You are given a list of integers nums which contains at least one 1. Return whether all the 1s appear consecutively.*/
import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        int f = -1;
        int l = -1;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (f == -1) {
                    f = i;
                }
                l = i;
                c++;
            }
        }
        return (c == l - f + 1);
    }
}
