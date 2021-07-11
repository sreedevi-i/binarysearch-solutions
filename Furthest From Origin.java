/* You are given a string s where each character is "L" meaning you moved one unit left, "R" meaning you moved one unit right, or "?" meaning either "L" or "R".

Given you are at position 0, return the maximum possible distance you could be from 0 by replacing "?" with "L" or "R".*/
import java.util.*;

class Solution {
    public int solve(String s) {
        int a= 0;
        int p = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                p++;
            } else if (c == 'R') {
                p--;
            } else {
                a++;
            }
        }
        return Math.abs(p) + a;
    }
}
