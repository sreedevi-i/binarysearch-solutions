/* 
You’re given a string s containing letters of three types, R, B, and ..

R represents your current position, B represents a blocked position, and . represents an empty position. In one step, you can move to any adjacent position to your current position, as long as it is empty. Can you reach either the leftmost position or the rightmost position?

Return true if you can reach either the leftmost or the rightmost position, or false if you cannot*/
import java.util.*;

class Solution {
    public boolean solve(String s) {
     int n=s.length()-1;
     int i=0;
     while(s.charAt(i)=='.')
     i++;
     while(s.charAt(n)=='.')
     n--;
     return s.charAt(i)=='R' || s.charAt(n)=='R';
    }
}
