/* Given a string s containing balanced parentheses "(" and ")", split them into the maximum number of balanced groups.*/
import java.util.*;

class Solution {
    public String[] solve(String s) {
        List<String> list = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                int top = stack.pop();
                if (stack.size() == 0) {
                    list.add(s.substring(top, i + 1));
                }
            }
        }

        String res[] = new String[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
