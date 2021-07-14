/* You are given a string s of "a" and "b"s. "a"s can stay "a" or turn into "b", but "b"s can't change.

Return the number of unique strings that can be made.*/
import java.util.*;

class Solution {
    public int solve(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a')
            c+=1;
        }
        return (int)Math.pow(2,c);
        
    }
}
