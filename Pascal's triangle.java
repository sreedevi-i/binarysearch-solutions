/* Given an integer n, return the nth (0-indexed) row of Pascal's triangle.

Pascal's triangle can be created as follows: In the top row, there is an array of 1. Each subsequent row is created by adding the number above and to the left with the number above and to the right, treating empty elements as 0.*/
import java.util.*;

class Solution {
    public int[] solve(int n) {
        int[] triangle=new int[n+1];
        triangle[n]=1;
        triangle[0]=1;
        for(int k=0;k<n;k++)
        {
            triangle[k+1]=triangle[k] * (n-k) / (k+1);
            triangle[n-1-k] =triangle[k+1];
        }
        return triangle;
    }
}
