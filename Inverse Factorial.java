/*The factorial of a number n is defined as n! = n * (n - 1) * (n - 2) * ... * 1.

Given a positive integer a, return n such that n! = a. If there is no integer n that is a factorial, then return -1.*/

import java.util.*;
import java.math.*;

class Solution {
    public int solve(int a) {
        int fact=1;
        if(a==1)
        return 1;
        for(int i=2;i<=a;i++){
            fact*=i;
            if(fact==a)
            return i;
            else if(fact>a)
            break;
        }
        return -1;
    }
}
