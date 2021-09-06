mport java.util.*;

class Solution {
    public boolean solve(String s0, String s1) {
         char[] ar = s0.toCharArray();
        char[] ar2 = s1.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ar2);
        if (!Arrays.equals(ar, ar2)) {
            return false;
        }

        if (s0.length() != s1.length()) {
            return false;
        }
        String news = s1;
        for (int i = 0; i < s0.length(); i++) {
            news = shiftOne(news);
            if (news.equals(s0)) {
                return true;
            }
        }
        return false;
    }

    public String shiftOne(String s) {
        return (s.substring(s.length() - 1) + s.substring(0, s.length() - 1));
    }
}
