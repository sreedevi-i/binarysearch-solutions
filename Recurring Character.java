/* Given a lowercase alphabet string s, return the index of the first recurring character in it. If there are no recurring characters, return -1.*/
import java.util.*;

class Solution {
    public int solve(String s) {
        int n=s.length();
        if(n==1 || n==0)
        return -1;
        HashSet<Character> h=new HashSet<Character>();
        for(int i=0;i<n;i++){
            if(h.contains(s.charAt(i))){
        
            return i;}else{
                h.add(s.charAt(i));
            }
        }
        return -1;
    }
}
