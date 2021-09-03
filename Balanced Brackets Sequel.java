/* Given a string s containing round, curly, and square open and closing brackets, return whether the brackets are balanced.*/
import java.util.*;

class Solution {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '[')
                st.push(']');
            else if (c == '{')
                st.push('}');
            else if (st.isEmpty() || st.pop() != c)
                return false;
        }
        return st.isEmpty();
    }
}
