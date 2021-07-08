/* Given a string s, consisting of digits and lowercase alphabet characters, that's a run-length encoded string, return its decoded version.

Note: The original string is guaranteed not to have numbers in it.

Constraints

0 ≤ n ≤ 100,000 where n is the length of s

Example 1

Input
s = "4a3b2c1d2a"

Output
"aaaabbbccdaa"

*/

import java.util.*;

class Solution {
    public String solve(String s) {
         int n=s.length();
        StringBuilder sb=new StringBuilder();
        int v = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                v = (v * 10) + Integer.parseInt("" + c);
            } else {
                for (int k = 0; k < v; k++) {
                    sb.append(c);
                }
                v = 0;
            }
        }
        return sb.toString();
    }
}
