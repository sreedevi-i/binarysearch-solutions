import java.util.*;

class Solution {
    public boolean solve(String s0, String s1) {
        int n=s0.length();
        int m=s1.length();
        if(n!=m)
        return false;
        char[] c1=s0.toCharArray();
        char[] c2=s1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<n;i++){
            if(c1[i]!=c2[i])
            return false;
        }
        return true;
    }
}
