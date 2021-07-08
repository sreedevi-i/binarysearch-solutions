/*
Given a two-dimensional integer list intervals of the form [start, end] representing intervals (inclusive), return their intersection, that is, the interval that lies within all of the given intervals.

You can assume that the intersection will be non-empty.

Constraints

1 ≤ n ≤ 100,000 where n is the length of intervals

Example 1

Input
intervals = [
    [1, 100],
    [10, 50],
    [15, 65]
]

Output
[15, 50]
Explanation
Consider the ranges [1, 100], [10, 50], [15, 65] on a line. The range [15, 50] is the only interval that is included by all of them.
*/

import java.util.*;

class Solution {
    public int[] solve(int[][] intervals) {
          int l = intervals[0][0];
    int r = intervals[0][1];
    int n=intervals.length;
    int b[]=new int[2];
     for (int i = 1; i < n; i++)
    {
 
        // If no intersection exists
        if (intervals[i][0] > r ||
            intervals[i][1] < l)
        {
           b[0]=0;
           b[1]=1;
            return b;
        }
 
        // Else update the intersection
        else
        {
            l = Math.max(l, intervals[i][0]);
            r = Math.min(r, intervals[i][1]);
        }
    }
    
    b[0]=l;
    b[1]=r;
    return b;
    }
}
