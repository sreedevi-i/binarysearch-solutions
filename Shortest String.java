/* Given a string s consisting only of "1"s and "0"s, you can delete any two adjacent letters if they are different.

Return the length of the smallest string that you can make if you're able to perform this operation as many times as you want.*/
import java.util.*;

class Solution {
    public int solve(String s) {
int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0')
                count++;
            else
                count--;
        }

        return Math.abs(count);

    }
}
