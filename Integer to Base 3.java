/* Given an integer n, return its base 3 representation as a string.*/
import java.util.*;

class Solution {
    public String solve(int n) {
        if(n<3)
        return String.valueOf(n);
        StringBuilder st=new StringBuilder();
        while(n!=0){
            st.append(n%3);
            n=n/3;
        }
       // String s= st.toString();

        return st.reverse().toString();
    }
}
