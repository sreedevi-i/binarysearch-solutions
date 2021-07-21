/* Given a list of positive integers nums, return the largest positive integer that divides each of the integers.*/
import java.util.*;

class Solution {
     static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public int solve(int[] nums) {
         int result = 0;
        for (int element: nums){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
    }
