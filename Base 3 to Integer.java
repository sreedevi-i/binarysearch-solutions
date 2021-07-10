/* Given a string s representing a number in base 3 (consisting only of 0, 1, or 2), return its decimal integer equivalent. This should be implemented directly without using a built-in function.*/
import java.util.*;

class Solution {
    public int solve(String s) {
        int n=s.length();
        int a=0;
        for(int i=0;i<n;i++){
            a=3*a+(s.charAt(i)-'0');
        }
        return a;
    }
}
