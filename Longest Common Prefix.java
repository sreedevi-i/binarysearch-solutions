/* Given a list of lowercase alphabet strings words, return the longest common prefix. /
import java.util.*;

class Solution {
    public String solve(String[] words) {
        Arrays.sort(words);
        int n = words.length;
        String s = words[0];
        if (n == 1)
            return s;
        String s1 = words[n - 1];

        StringBuilder res = new StringBuilder();
         for (int i = 0; i < Math.min(s1.length(), s.length()); i++) {
            if (s.charAt(i) == s1.charAt(i))
                res.append(s.charAt(i));
            else
                break;
        }
        return res.toString();
    }
}
