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
