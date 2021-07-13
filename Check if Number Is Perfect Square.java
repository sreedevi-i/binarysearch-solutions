/* Given an integer n, return whether n = k * k for some integer k.*/
import java.util.*;

class Solution {
    public boolean solve(int n) {
        if(n<=1)
        return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(i*i==n)
            return true;
        }
        return false;
    }
}
