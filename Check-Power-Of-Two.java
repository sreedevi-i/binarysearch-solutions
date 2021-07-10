/* 
Given an integer n greater than or equal to 0, return whether it is a power of two */
import java.util.*;

class Solution {
    public boolean solve(int n) {
        return (n!=0) && (n&(n-1))==0;
    }
}
