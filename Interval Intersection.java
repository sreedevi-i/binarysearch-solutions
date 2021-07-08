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
